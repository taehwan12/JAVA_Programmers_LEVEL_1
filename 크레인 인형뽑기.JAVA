import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
/*
        0 0 0 0 0
        0 0 1 0 3
        0 2 5 0 1
        4 2 4 4 2
        3 5 1 3 1
        board[1][4] = 3
        board[4][1] = 5
*/
        //1. 인형이 있는 꼭대기 층을 구한다
        int[] top = new int[board.length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length;j++){
                if(board[j][i] != 0){
                    top[i] = j;
                    break;
                }
            }
        }
        
        //2. 인형을 뽑고 순서대로 쌓아둘 스택
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < moves.length; i++){
            if(top[moves[i] - 1] != board.length){
                //인형이 뽑히면
                if(stack.empty()){
                    stack.push(board[top[moves[i] - 1]][moves[i] - 1]);
                }
                else{
                    if(stack.peek() == board[top[moves[i] - 1]][moves[i] - 1]){
                        stack.pop();
                        answer += 2;
                    }
                    else{
                        stack.push(board[top[moves[i] - 1]][moves[i] - 1]);
                    }
                }
                top[moves[i] - 1]++;
            }
        }
        return answer;
    }
}
