class Solution(object):
    def buildArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = [-1]*len(nums)
        for i  in range(len(nums)):
            res[i] = nums[nums[i]]
        return res