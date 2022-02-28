import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n + 1];
        
        //각각 체육복 현황
        for(int i = 0; i <= n; i++){ //0은 비워둠
            arr[i] = 1;
        }
        for(int j = 0; j < lost.length; j++){
            arr[lost[j]]--;
        }
        for(int k = 0; k < reserve.length; k++){
            arr[reserve[k]]++;
        }
        
        if(arr[1] == 0 && arr[2] > 1){
            arr[1]++;
            arr[2]--;
        }
        for(int i = 1; i <= n; i++){
            if(arr[i] == 2){
                if(arr[i - 1] == 0){
                    arr[i]--;
                    arr[i - 1]++;
                }
                else if(i < n && arr[i + 1] == 0){ //i == n 일 때 배열 범위 초과
                    arr[i + 1]++;
                    arr[i]--;
                }
            }
        }
        for(int i = 1; i <= n; i++){
            if(arr[i] > 0)
                answer++;
        }
        return answer;
    }
}
