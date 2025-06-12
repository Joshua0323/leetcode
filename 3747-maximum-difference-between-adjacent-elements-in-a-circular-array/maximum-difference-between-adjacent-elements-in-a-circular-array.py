class Solution(object):
    def maxAdjacentDistance(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res=0
        for i in range(len(nums)-1):
            res=max(res,abs(nums[i]-nums[i+1])) 
        res=max(res,abs(nums[len(nums)-1]-nums[0]))
        return res

        