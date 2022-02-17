class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int division = 0, harshad = x;
        while(x > 0){
            division += x % 10;
            x /= 10;
        }
        if(harshad % division != 0)
            answer = false;
        return answer;
    }
}
