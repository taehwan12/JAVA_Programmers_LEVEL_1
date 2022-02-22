import java.util.ArrayList;
import java.util.Collections;


class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer.add(arr[i]);
                cnt++;
            }
        }
        if(cnt == 0)
            answer.add(-1);
        Collections.sort(answer);
        int[] a = new int[answer.size()];
        for(int i = 0; i < a.length; i++){
            a[i] = answer.get(i);
        }
        return a;
    }
}
