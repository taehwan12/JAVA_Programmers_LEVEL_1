class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 80 || s.charAt(i) == 112)
                cnt++;
            if(s.charAt(i) == 89 || s.charAt(i) == 121)
                cnt--;
        }
        if(cnt != 0)
            answer = false;
        return answer;
    }
}
