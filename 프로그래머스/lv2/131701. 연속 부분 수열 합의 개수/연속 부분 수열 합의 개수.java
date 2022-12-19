import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int solution(int[] elements) {
        int[] arr = new int[elements.length * 2];
        for(int i = 0; i < elements.length; i++) 
            arr[i] = arr[i + elements.length] = elements[i];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i <= elements.length; i++)
            for(int j = 0; j < elements.length; j++)
                set.add(Arrays.stream(arr, j, j + i).sum());
        return set.size();
    }
}