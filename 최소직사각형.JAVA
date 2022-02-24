class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }   //0번째 행에 긴 길이들, 1번째 행에 짧은 길이들
        }
        int max0 = sizes[0][0];
        int max1 = sizes[0][1];
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > max0)
                max0 = sizes[i][0];
            if(sizes[i][1] > max1)
                max1 = sizes[i][1];
        }
        return max0 * max1;
    }
}
