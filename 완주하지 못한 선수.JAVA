import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) { //참가자, 완주자(참가자-1)
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i]))
                break;
        }
        return participant[i];
    }
}
