class Solution {
    public int maxOperations(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int sum=nums[0]+nums[1];
        int ans=1;

        for(int i=3;i<nums.length;i+=2){
            if((nums[i]+nums[i-1])==sum){
                ans++;
                continue;

            }
            else{
                return ans;
            }
            
        }
        return ans;
        
    }
}