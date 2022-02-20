//에라토스테네스의 체
class Solution {
    public int solution(int n) {
        int cnt = 0;
        boolean[] isPrime = new boolean[n + 1];
        for(int i = 2; i <= n; i++){
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(isPrime[i]){
                for(int j = i * i; j <= n; j += i){
                    //j = i + i부터 시작하는 이유는 i * 2, i * 3(<i)은
                    //이미 앞에서 지워졌기 때문에 또 연산할 필요가 없음
                    //j = j + i인 이유는 i의 배수만큼 건너뛰어야 반복되지 않는 (위 연산들) 연산을 할 수 있음 
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 1; i <= n; i++){
            if(isPrime[i])
                cnt++;
        }
        return cnt;
    }
}
