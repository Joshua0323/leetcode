class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        int j = 0;
        boolean res = false;
        if(nums.length == 1){
            res = true;
            return res;
        }
        
        while(nums[i] <= nums[i+1]){
            i++;
            if (i == nums.length - 1) {
                res = true;
                break;
            }
        }
        
        while(nums[j] >= nums[j+1]){
            j++;
            if (j == nums.length - 1) {
                res = true;
                break;
            }
        }
        return res;
    }
}