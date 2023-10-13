class Solution {
    public int minCostClimbingStairs(int[] cost) {

        for (int idx = 2; idx < cost.length; idx++) {
            cost[idx] += Math.min(cost[idx-1], cost[idx-2]);
        }
    
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }
}