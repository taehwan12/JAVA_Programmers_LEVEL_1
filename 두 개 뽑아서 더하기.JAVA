import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(!sum.contains(numbers[i] + numbers[j]))
                    sum.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(sum);
        answer = new int[sum.size()];
        for(int i = 0; i < sum.size(); i++){
            answer[i] = sum.get(i);
        }
        return answer;
    }
}
