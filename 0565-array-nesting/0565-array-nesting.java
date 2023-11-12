class Solution {
    public int arrayNesting(int[] nums) {
        int count,max=0;
        
        for(int i=0;i<nums.length;i++){
          count=0;
            int index=i;
            while(nums[index]!=-999){     
                int temp=nums[index];
                nums[index]=-999;
                index=temp;
                count++;
            }
          max=Math.max(count,max);
      }
        return max;
    }
}