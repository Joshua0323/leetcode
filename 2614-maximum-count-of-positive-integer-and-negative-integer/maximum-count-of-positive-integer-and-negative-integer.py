class Solution(object):
    def maximumCount(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        neg = 0
        pos = 0
        for num in nums:
            if num < 0:
                neg += 1
            elif num > 0:
                pos += 1

        return max(neg, pos)