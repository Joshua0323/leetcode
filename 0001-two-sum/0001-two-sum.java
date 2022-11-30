class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];
        int sum = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j <nums.length; j++) {
                if (i == j)
                {
                    ++j;
                }
                sum = nums[i] + nums[j];
                if (sum == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}