class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int a[]=new int[51];
        int len=nums.length;
        int res[]=new int[len];
        for(int i:nums)
        {
            a[i]++;
        }
        int b[]=new int[51];
        for(int i=0;i<len;i++)
        {
            b[nums[i]]++;
            a[nums[i]]--;
            int count=0,count1=0;
            for(int j=1;j<=50;j++)
            {
                if(a[j]>0)
                {
                    count++;
                }
            }
            for(int j=1;j<=50;j++)
            {
                if(b[j]>0)
                {
                    count1++;
                }
            }
            res[i]=count1-count;
        }
        return res;
    }
}