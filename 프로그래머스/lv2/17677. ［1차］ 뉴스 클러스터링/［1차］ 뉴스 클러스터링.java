import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for(int i = 0; i < str1.length() - 1; i++) {
            char temp1 = str1.charAt(i);
            char temp2 = str1.charAt(i + 1);
            if(temp1 >= 'a' && temp1 <= 'z' && temp2 >= 'a' && temp2 <= 'z') {
                String temp = str1.substring(i, i + 2);
                list1.add(temp);
            }
        }for(int i = 0; i < str2.length() - 1; i++) {
            char temp1 = str2.charAt(i);
            char temp2 = str2.charAt(i + 1);
            if(temp1 >= 'a' && temp1 <= 'z' && temp2 >= 'a' && temp2 <= 'z') {
                String temp = str2.substring(i, i + 2);
                list2.add(temp);
            }
        }
        Collections.sort(list1);
		Collections.sort(list2);

        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        for(String str : list1) {
            if(list2.remove(str))
				intersection.add(str);
			union.add(str);
        }
        for(String str : list2)
			union.add(str);
        
        double a = intersection.size();
		double b = union.size();
   		double jakard = 0;	
		if(union.size() == 0)
			jakard = 1;
		else
			jakard = (double) intersection.size() / (double) union.size();
        return answer = (int) (jakard * 65536);
    }
}