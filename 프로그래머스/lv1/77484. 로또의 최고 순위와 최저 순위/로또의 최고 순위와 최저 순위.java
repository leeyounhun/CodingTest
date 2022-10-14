class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int cntZero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0){
                cntZero++;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j])
                    cnt++;
            }
        }
        if (cntZero == 6){
            answer[0] = 1;
            answer[1] = 6;
        } else if (cnt == 0 && cntZero == 0) {
            answer[0] = 6;
            answer[1] = 6;
        } else {
            answer[0] = 7 - cnt - cntZero;
            answer[1] = 7 - cnt;
        }
        return answer;
    }
}