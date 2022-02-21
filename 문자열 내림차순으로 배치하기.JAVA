import java.util.*;

class Solution {
    public String solution(String s) {
        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            b[i] = a[a.length - i - 1];
        }
        return String.valueOf(b);
    }
}
