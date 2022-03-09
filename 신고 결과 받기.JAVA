import java.util.*;

class User{
    String name;    //내 이름
    ArrayList<String> reported;   //내가 신고한 사람들
    int gotReported;    //내가 신고 당한 횟수
    public User(String name){
        this.name = name;
        this.reported = new ArrayList<String>();
        this.gotReported = 0;
    }
}
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        User[] user = new User[id_list.length]; //user[1].name, .re, .got
        String[] temp = new String[2];
        for(int i = 0; i < id_list.length; i++){
            user[i] = new User(id_list[i]);
        }
        for(int i = 0; i < report.length; i++){
            temp = report[i].split(" ");
            for(int j = 0; j < id_list.length; j++){
                if(temp[0].equals(user[j].name)){
                    if(!user[j].reported.contains(temp[1]))
                        user[j].reported.add(temp[1]);
                }
                // if(temp[1].equals(user[j].name)){
                //     user[j].gotReported++;
                // }
            }
        }
        for(int i = 0; i < id_list.length; i++){
            for(int j = 0; j < id_list.length; j++){
                if(user[i].reported.contains(user[j].name)){
                    user[j].gotReported++;
                }
            }
        }
        for(int i = 0; i < id_list.length; i++){
            if(user[i].gotReported >= k){
            //신고횟수를 도달한 유저
                for(int j = 0; j < id_list.length; j++){
                    if(user[j].reported.contains(user[i].name))
                        answer[j]++;
                }
            }
        }
        return answer;
    }
}
