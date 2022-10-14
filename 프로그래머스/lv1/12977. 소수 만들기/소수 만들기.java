import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) 
             for (int j = i + 1; j < nums.length; j++) 
                  for (int k = j + 1; k < nums.length; k++) 
                      arr.add(nums[i] + nums[j] + nums[k]);
        boolean[] prime = new boolean[3000];
        prime[0] = prime[1] = true;
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i])
                continue;
            for (int j = i * 2; j < prime.length; j += i)
                prime[j] = true;
        }
        for(int i = 0; i < arr.size(); i++) 
            if(!prime[arr.get(i)])
                answer++;
        return answer;
    }
}