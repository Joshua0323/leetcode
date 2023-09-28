class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }    
        Collections.sort(even, Comparator.naturalOrder());
        Collections.sort(odd, Comparator.naturalOrder());
        for (int i = 0; i < nums.length; i++) {
            if(i < even.size()) {
                res[i] = even.get(i); 
            } else {
                res[i] = odd.get(i-even.size());
            }        
        }
        return res;
    }
}