class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 1, min = 1, temp; //최대공약수, 최소공배수
        if(n > m){
            temp = n;
            n = m;
            m = temp;
        }
        
        //최대공약수 구하기
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                if(m % i == 0)
                    max = i;
        }
        //최소공배수 구하기
        for(int i = 1; i <= n; i++){
            if(((m * i) % n) == 0){
                min = m * i;
                break;
            }
        }
        answer[0] = max;
        answer[1] = min;
        return answer;
    }
}
