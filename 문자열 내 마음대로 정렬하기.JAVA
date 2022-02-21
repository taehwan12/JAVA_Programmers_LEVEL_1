import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] copy = new String[strings.length];
        int[] index = new int[strings.length];
        for(int i = 0; i < strings.length; i++){
            copy[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(copy);
        for(int i = 0; i < strings.length; i++){
            copy[i] = copy[i].substring(1);
        }
        return copy;
    }
}
