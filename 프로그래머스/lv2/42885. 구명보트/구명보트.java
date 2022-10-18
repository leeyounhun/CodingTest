import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
		int index = 0;
		Arrays.sort(people);
		for(int i = people.length - 1; index <= i; i--) {
			if(people[i] + people[index] > limit)
				answer++;
			else {
				answer++;
				index++;
			}
		}
		return answer;
    } 
}