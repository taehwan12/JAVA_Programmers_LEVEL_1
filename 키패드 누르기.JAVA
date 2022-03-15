class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        Coordinate[] coor = new Coordinate[12];
        
        for(int i = 0; i < 12; i++){
            coor[i] = new Coordinate(i);
        }
        
        int lastL = 10; //왼손은 *에서 시작
        int lastR = 11; //오른손은 #에서 시작
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 3 == 1){
                answer += "L";
                lastL = numbers[i];
            }
            if(numbers[i] % 3 == 0 && numbers[i] != 0){
                answer += "R";
                lastR = numbers[i];
            }
            if(numbers[i] % 3 == 2 || numbers[i] == 0){
                if(distance(lastL, numbers[i]) == distance(lastR, numbers[i])){
                    if(hand.equals("left")){
                        answer += "L";
                        lastL = numbers[i];
                    }
                    else if(hand.equals("right")){
                        answer += "R";
                        lastR = numbers[i];
                    }
                }
                else if(distance(lastL, numbers[i]) > distance(lastR, numbers[i])){
                    answer += "R";
                    lastR = numbers[i];
                }
                else if(distance(lastL, numbers[i]) < distance(lastR, numbers[i])){
                    answer += "L";
                    lastL = numbers[i];
                }
            }
        }
        return answer;
    }
    public int distance(int a, int b){
        Coordinate coorA = new Coordinate(a);
        Coordinate coorB = new Coordinate(b);
        int xd = Math.abs(coorA.x - coorB.x);
        int yd = Math.abs(coorA.y - coorB.y);
        return xd + yd;
    }
}
class Coordinate {
    int x;
    int y;
    public Coordinate(int num){
        this.x = num % 3;
        if(x == 0)
            this.x = 3;
        this.y = (num - 1) / 3 + 1;
        if(num == 0){
            this.x = 2;
            this.y = 4;
        }
        if(num == 10){
            this.x = 1;
            this.y = 4;
        }
        if(num == 11){
            this.x = 3;
            this.y = 4;
        }
    }
}
