class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        //1단계
        new_id = new_id.toLowerCase();
        
        //2단계
        for(int i = 0; i < new_id.length(); i++){
            //45-, 46., 95_, 97~122 소문자
            if(new_id.charAt(i) == '-' || new_id.charAt(i) == '.' || new_id.charAt(i) == '_' || (new_id.charAt(i) >= 97 && new_id.charAt(i) <= 122) || (new_id.charAt(i) >= 48 && new_id.charAt(i) <= 57))
                answer += new_id.charAt(i);
        }
        
        //3단계
        while(answer. contains("..")){
            answer = answer.replace("..", ".");
        }
        
        //4단계
        StringBuilder str = new StringBuilder(answer);
        if(str.charAt(0) == '.'){
            str.deleteCharAt(0);
        }
        if(str.length() > 0){   //?
            if(str.charAt(str.length() - 1) == '.'){
                str.deleteCharAt(str.length() - 1);
            }
        }
        
        //5단계
        if(str.length() == 0)
            str.append("a");
        
        //6단계
        if(str.length() >= 16){
            str.delete(15, str.length());
        }
        
        //4단계 반복
        if(str.charAt(str.length() - 1) == '.'){
            str.deleteCharAt(str.length() - 1);
        }
        
        //7단계
        while(str.length() < 3){
            str.append(str.charAt(str.length() - 1));
        }
        System.out.println(str);
        
        return str.toString();
    }
}
