class Solution {
    public String solution(String s) {
        String answer = "";
        char[] a = s.toCharArray();
        int cnt = 0; //단어 내에서의 인덱스
        for(int i = 0; i < a.length; i++){ //배열의 인덱스
            if(a[i] == ' '){
                answer += a[i];
                cnt = 0;
                continue;
            }
            else{
                if(cnt % 2 == 0){
                    answer += Character.toUpperCase(a[i]);
                    cnt++;
                }
                else{
                    answer += Character.toLowerCase(a[i]);
                    cnt++;
                }
            }
        }
        return answer;
    }
}
