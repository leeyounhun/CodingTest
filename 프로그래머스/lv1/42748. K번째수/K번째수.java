import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int first = commands[i][0] - 1;
            int last = commands[i][1] - 1;
            int index = commands[i][2] - 1;
            int[] temp = new int[last - first + 1];
            for (int j = 0; j < temp.length; j++) 
                temp[j] =  array[j + first];
            Arrays.sort(temp);
            answer[i] = temp[index];
        }
        return answer;
    }
}