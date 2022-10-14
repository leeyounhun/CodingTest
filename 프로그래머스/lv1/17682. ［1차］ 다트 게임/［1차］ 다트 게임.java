import java.util.ArrayList;
import java.util.StringTokenizer;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(dartResult, "SDT*#", true);
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            switch (temp) {
                case "*":
                    if (list.size() == 1)
                        list.set(0, list.get(0) * 2);
                    else {
                        list.set(list.size() - 1, list.get(list.size() - 1) * 2);
                        list.set(list.size() - 2, list.get(list.size() - 2) * 2);
                    }
                    break;
                case "#":
                    list.set(list.size() - 1, list.get(list.size() - 1) * -1);
                    break;
                case "S":
                    break;
                case "D":
                    list.set(list.size() - 1, (int) Math.pow(list.get(list.size() - 1), 2));
                    break;
                case "T":
                    list.set(list.size() - 1, (int) Math.pow(list.get(list.size() - 1), 3));
                    break;
                default:
                    list.add(Integer.parseInt(temp));
                    break;
            }
        }
        for (int n : list)
            answer += n;
        return answer;
    }
}