class Solution(object):
    def maxAscendingSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        sums = highest = nums[0]

        for i in range(1, len(nums)):
            sums = sums + nums[i] if nums[i] > nums[i - 1] else nums[i]
            highest = max(sums, highest)

        
        return highest