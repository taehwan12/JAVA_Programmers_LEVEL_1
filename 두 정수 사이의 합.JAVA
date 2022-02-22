class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        long temp;
        if(a == b)
            return a;
        if(b < a){
            temp = b;
            b = a;
            a = temp;
        }
        answer = ((b - a - 1) * (a + b) / 2) + a + b;
        return answer;
    }
}
