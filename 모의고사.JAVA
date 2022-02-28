import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        ArrayList<Integer> large = new ArrayList<Integer>();
        int[] check1 = {1, 2, 3, 4, 5};
        int[] check2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] check3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] sum = {0, 0, 0}; //점수 합계
        int[] arr = new int[3];
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == check1[i % 5]){
                sum[0]++;
            }
            if(answers[i] == check2[i % 8]){
                sum[1]++;
            }
            if(answers[i] == check3[i % 10]){
                sum[2]++;
            }
        }
        for(int i = 0; i < 3; i++){
            arr[i] = sum[i];
        }
        Arrays.sort(arr); //오름차순한 arr[2] 가 제일 큰 점수
        for(int i = 0; i < 3; i++){
            if(sum[i] == arr[2])
                large.add(i + 1);   //제일 점수 큰 학생 번호 저장
        }
        answer = new int[large.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = large.get(i);
        }
        return answer;
    }
}
