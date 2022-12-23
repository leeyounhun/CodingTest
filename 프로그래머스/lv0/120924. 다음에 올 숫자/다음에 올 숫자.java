class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int tmp = common[1] - common[0];
        boolean flag = true;
        for(int i=0; i<common.length-1; i++)
            if(tmp != common[i+1] - common[i]){
                flag = false;
                break;
            }

        if(flag)
            answer = common[common.length - 1] + tmp;
        else {
            tmp = common[1] / common[0];
            answer = common[common.length - 1] * tmp;
        }
        
        return answer;
    }
}