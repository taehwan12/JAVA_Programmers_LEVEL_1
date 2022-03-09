class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;    //0의 개수
        int winCnt = 0; //맞춘 개수
        for(int i = 0; i < 6; i++){
            if(lottos[i] == 0){
                cnt++;
                continue;
            }
            for(int j = 0; j < 6; j++){
                if(lottos[i] == win_nums[j]){
                    winCnt++;
                }
            }
        }
        //최저 순위는 6 - winCnt + 1 의 값이
        // 6 이상이면 낙첨
        // 5 이면 5순위 ...
        // 1 이면 1순위
        //최고 순위는 최저 순위 - 0의 개수
        int place = 6 - winCnt + 1;
        for(int i = 1; i <= 7; i++){
            if(place == i){
                answer[0] = place - cnt;
                answer[1] = place;
                if(place == 7){  //예외 처리; 순위 계산 값이 7, 0의 개수가 0개일 때
                    if(cnt == 0)
                        answer[0] = 6;
                    answer[1] = 6;
                }
            }
        }
        return answer;
    }
}
