class Solution {
    public int solution(String dartResult) {
        char[] a = dartResult.toCharArray();
        int[] num = new int[3];
        int index = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] >= '0' && a[i] <= '9'){
                if((i + 1) != (a.length - 1) && a[i] == '1' && a[i + 1] == '0'){ //i 가 문자열의 끝이 아닌데, 정수(0)가 또 나왔다? 하면 조건 성립
                    num[index] = 10;
                    i++;
                }
                else{   //정수가 또 안 나오면 그냥 바로 저장
                    num[index] = a[i] - '0';
                }
                index++;
            }
            // else if(a[i] == 'S'){
            //     num[index];
            // }
            else if(a[i] == 'D'){
                num[index - 1] *= num[index - 1];
            }
            else if(a[i] == 'T'){
                num[index - 1] *= num[index - 1] * num[index - 1];
            }
            else if(a[i] == '*'){
                if(index  - 1 != 0)
                    num[index - 2] *= 2;
                num[index - 1] *= 2;
            }
            else if(a[i] == '#'){
                num[index - 1] *= -1;
            }
        }
        return num[0] + num[1] + num[2];
    }
}
