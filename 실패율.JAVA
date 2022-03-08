import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] above = new double[N + 1];   //해당 단계는 도달했던 사람 (1, 2 ~ N)
        double[] cur = new double[N + 1];     //해당 단계에 못 깨고 남은 사람 (1 ~ N)
        ArrayList<Double> failure = new ArrayList<Double>();
        ArrayList<Double> copy = new ArrayList<Double>();
        
        cur[0] = 0;                     //0단계인 사람은 없음
        for(int i = 0; i < stages.length; i++){ //전체 사람 수 = stages.length
            if(stages[i] == N + 1)      //모두 깬 사람은 머무는 스테이지가 없다
                continue;
            cur[stages[i]]++;
        }
        
        above[1] = stages.length;
        for(int i = 2; i <= N; i++){
            above[i] = above[i - 1] - cur[i - 1];
        }

        for(int i = 1; i <= N; i++){
            if(above[i] == 0)       //해당 단계에 도달한 사람이 아예 없다
                failure.add(0.0);
            else{
                cur[i] /= above[i];     //못 깨고 남은 사람 대신 실패율 저장
                //나눗셈에서 분모가 0이 되는 경우를 항상 생각하자
                failure.add(cur[i]);
            }
        }
        
        Collections.sort(failure, Collections.reverseOrder());
        
        for(int i = 0; i < failure.size(); i++){
            for(int j = 1; j <= N; j++){
                if(failure.get(i) == cur[j]){
                    answer[i] = j;
                    cur[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
