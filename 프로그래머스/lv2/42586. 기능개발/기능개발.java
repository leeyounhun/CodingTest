class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 0;
        String temp = "";
        int cnt = 1;
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i] + speeds[i] * day;
            if (progress >= 100) 
                cnt++;
             else {
                temp = temp + cnt + " ";
                cnt = 1;
                while(progress < 100) {
                    progress += speeds[i];
                    day++;
                }
            }
        }
        temp = temp + cnt + " ";
        temp = temp.substring(2);
        String[] str = temp.split(" ");
        System.out.println(temp);
        int[] answer = new int[str.length];
        for (int i = 0; i < str.length; i++)
            answer[i] = Integer.parseInt(str[i]);
        return answer;
    }
}