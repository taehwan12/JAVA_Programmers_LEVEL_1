class Solution {
    public String solution(String s, int n) {
        char[] a = s.toCharArray();
        for(int i = 0; i < a.length; i++){
            if(a[i] == ' ')
                continue;
            if(a[i] < 91){
                //대문자인 경우
                if(a[i] + n > 90)
                    //넘어가는 경우
                    a[i] = (char)(a[i] + n - 26);
                else
                    a[i] += n;
            }
            if(a[i] > 96){
                //소문자인 경우
                if(a[i] + n > 122)
                    a[i] = (char)(a[i] + n - 26);
                else
                    a[i] += n;
            }
        }
        return String.valueOf(a);
    }
}
