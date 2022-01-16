/*
Solution Starts

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int reset = 0, i = 0, j = 0;
        for(i = 0; i < nums.length - 1; i++){
            for(j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    reset = 1;
                    break;
                }
            }
            if(reset == 1)
                break;
        }
        int[] res = {i, j};
        return res;
    }
}


Solution ends
*/