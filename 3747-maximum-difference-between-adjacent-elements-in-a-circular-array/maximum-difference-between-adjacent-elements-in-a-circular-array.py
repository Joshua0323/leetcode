class Solution(object):
    def maxAdjacentDistance(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_num = 0
        min_num = 0
        res = 0

        for i in range(len(nums) - 1):
            res = max(res, abs(nums[i] - nums[i + 1])) 

        res = max(res, abs(nums[len(nums) - 1] - nums[0]))

        return res

        