import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] sort = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            sort[i] = Integer.toString(numbers[i]);
        Arrays.sort(sort, new Comparator<String> (){
            @Override
            public int compare(String o1, String o2) {
			    return (o2+o1).compareTo(o1+o2);
		    }
        });
        if (sort[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for (String st : sort)
            sb.append(st);
        return answer = sb.toString();
    }
}