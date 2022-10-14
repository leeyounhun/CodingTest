import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        ArrayList<double[]> arr = new ArrayList<>();
        double stage = stages.length;
        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 0; j < stages.length; j++) 
                if (stages[j] == i)
                    cnt++;
            if(cnt==0){
                arr.add(new double[] { i, 0 });
                continue;
            }
            double temp = cnt / stage;
            arr.add(new double[] { i, temp });
            stage -= cnt;
            cnt = 0;
        }
        arr.sort((o1, o2) -> Double.compare(o2[1], o1[1]));
        for(int i = 0; i < arr.size(); i++){
            answer[i] = (int)arr.get(i)[0];
        }
        return answer;
    }
}