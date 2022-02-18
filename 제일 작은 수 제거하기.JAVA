import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int[] arr2 = new int[arr.length];
        
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);
        int min = arr2[0];
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != min)
                list.add(arr[i]);
        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
