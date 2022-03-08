class Solution {
    public boolean isPrime(int number){
        int cnt = 0;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                cnt++;
                break;
            }
        }
        if(cnt == 0)
            return true; //소수입니다
        return false; //소수가 아닙니다
    }
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                        if(isPrime(nums[i] + nums[j] + nums[k]))
                            answer++;
                }
            }
        }

        return answer;
    }
}
