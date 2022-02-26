import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> ternary = new ArrayList<Integer>();
        while(n > 0){
            ternary.add(n % 3);
            n /= 3;
        }
        for(int i = ternary.size() - 1; i >=0 ; i--){
            answer += ternary.get(i) * Math.pow(3, ternary.size() - i - 1);
        }
        
        return answer;
    }
}
