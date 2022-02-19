class Solution {
    public int[] solution(long n) {
        int[] answer = new int[(int)Math.log10(n) + 1];
        int cnt = 0;
        while(n > 0){
            answer[cnt] = (int)(n % 10);
            n /= 10;
            cnt++;
        }
        return answer;
    }
}
