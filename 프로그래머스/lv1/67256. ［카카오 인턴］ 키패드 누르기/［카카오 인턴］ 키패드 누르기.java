class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lHend = 10;
        int rHend = 12;
        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                lHend = num;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                rHend = num;
            } else {
                if (num == 0)
                    num = 11;
                int left = Math.abs(num - lHend) / 3 + Math.abs(num - lHend) % 3;
                int right = Math.abs(num - rHend) / 3 + Math.abs(num - rHend) % 3;
                if (left < right) {
                    sb.append("L");
                    lHend = num;
                } else if (left > right) {
                    sb.append("R");
                    rHend = num;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        lHend = num;
                    } else {
                        sb.append("R");
                        rHend = num;
                    }
                }
            }
        }
        return answer = sb.toString();
    }
}