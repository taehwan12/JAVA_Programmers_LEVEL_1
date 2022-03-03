import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
    int sum = 0;
    for(int i = 0; i < numbers.length; i++){
        if(!Arrays.asList(numbers).contains(i))
            sum += numbers[i];
    }
    return 45 - sum;
    }
}
