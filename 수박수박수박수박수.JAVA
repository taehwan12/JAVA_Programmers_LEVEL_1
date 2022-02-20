class Solution {
    public String solution(int n) {
        char[] a = new char[n];
        for(int i = 0;i < n; i++){
            if(i % 2 == 0){
                a[i] = '수';
            }
            else
                a[i] = '박';
        }
        return String.valueOf(a);
    }
}
