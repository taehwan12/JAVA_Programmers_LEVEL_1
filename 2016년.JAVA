class Solution {
    public String solution(int a, int b) {
        //1.31 2.29 3.31 4.30 5.31 6.30 7.31 8.31 9.30 10.31 11.30 12.31
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] date = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int sumDays = b;
        for(int i = 0; i < a; i++){
            sumDays += days[i];
        }
        return date[(sumDays - 1) % 7];
    }
}
