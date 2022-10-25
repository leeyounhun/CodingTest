import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public ArrayList solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        s = s.substring(2, s.length() - 2);
        s = s.replaceAll("\\},\\{", " ");
        String[] arr = s.split(" ");
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        for(String str : arr){
            String[] temp = str.split(",");
            for(int i = 0 ; i < temp.length;i++){
                int n = Integer.parseInt(temp[i]);
                if(!answer.contains(n))
                    answer.add(n);
            }
        }
        return answer;
    }
}