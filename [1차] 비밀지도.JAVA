class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] a1 = new String[n];
        String[] a2 = new String[n];
        String[] sum = new String[n];
        for(int i = 0; i < n; i++){
            //  if(arr1[i] < Math.pow(n - 1, 2))    //이진수로 변환했을 때 앞에 0이 생략                
            a1[i] = Integer.toBinaryString(arr1[i]);
            a2[i] = Integer.toBinaryString(arr2[i]);
            sum[i] = String.valueOf(Long.parseLong(a1[i]) + Long.parseLong(a2[i])); //sum[0] = "12111", sum[1] = "10101"
            while(sum[i].length() < n){
                sum[i] = "0" + sum[i];
            }
        }
        for(int i = 0; i < n; i++){
            sum[i] = sum[i].replaceAll("0", " ");
            sum[i] = sum[i].replaceAll("[1-9]", "#");
            // if(sum[i].replaceAll("[1-9]", "#"))
        }
        return sum;
    }
}
