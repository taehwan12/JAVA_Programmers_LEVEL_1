import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> type = new ArrayList<Integer>();
        //N = nums.length
        //nums의 원소 중복 경우 제거하여 type 을 도출
        for(int i = 0; i < nums.length; i++){
            if(!type.contains(nums[i])){
                type.add(nums[i]);
            }
        }
        if(type.size() > nums.length / 2)
            answer = nums.length / 2;
        else
            answer = type.size();
        return answer;
    }
}
