class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j])
        //             count++;
        //     }
        // }
        // return count;

        int count=0;
        Map<Integer,Integer> map=new HashMap<>();

        for(int num: nums){
            int isFoundCount=map.getOrDefault(num,0);
            count+=isFoundCount;
            map.put(num,isFoundCount+1);
        }
        return count;
    }
}