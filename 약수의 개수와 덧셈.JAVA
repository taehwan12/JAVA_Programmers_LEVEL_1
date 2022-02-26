class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt;
        //누군가의 제곱일 때만 홀수이다. 1을 제외하고. 뚜둥!
        for(int i = left; i <= right; i++){
            if((int)Math.sqrt(i) == Math.sqrt(i) || i == 1){
                answer -= i;
            }
            else
                answer += i;
        }
        return answer;
    }
}
