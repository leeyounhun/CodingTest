class Solution {
    public int solution(String[] babbling) {
        String[] arr = new String[] {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (int i = 0 ; i < babbling.length; i++) {
            for (String str : arr)
                babbling[i] = babbling[i].replaceAll(str, "!");
            babbling[i] = babbling[i].replaceAll("^!+$", "!");
            if (babbling[i].equals("!"))
                answer++;
        }
        return answer;
    }
}