class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String st : skill_trees) {
            String temp[] = st.split("");
            for (String s : temp)
                if (!skill.contains(s))
                    st = st.replaceAll(s, "");
            if (skill.substring(0, st.length()).equals(st))
                answer++;
        }
        return answer;
    }
}