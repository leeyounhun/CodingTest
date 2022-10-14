import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] arr3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % arr1.length])
                cnt1++;
            if (answers[i] == arr2[i % arr2.length])
                cnt2++;
            if (answers[i] == arr3[i % arr3.length])
                cnt3++;
        }
        int max = Math.max(Math.max(cnt1, cnt2), cnt3);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(max == cnt1) 
            temp.add(1);
        if(max == cnt2) 
            temp.add(2);
        if(max == cnt3) 
            temp.add(3);
        int[] answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) 
        	answer[i] = temp.get(i);
        return answer;
    }
}