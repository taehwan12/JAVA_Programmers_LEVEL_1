class Solution {
    public long solution(int price, int money, int count) {
        long sum = count * (count + 1) / 2;
        if(sum * price < money)
            return 0;
        else
            return sum * price - money;
    }
}
