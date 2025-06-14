class Solution(object):
    def minimizeMax(self, nums, p):
        """
        :type nums: List[int]
        :type p: int
        :rtype: int
        """
        nums.sort()
        n=len(nums)
        low=0
        high=nums[-1]-nums[0]
        while low<high:
            i=1
            count=0
            diff=low+(high-low)/2
            while i<n:
                if nums[i]-nums[i-1]<=diff:
                    count+=1
                    i+=1
                i+=1
            if count<p:
                low=diff+1
            else:
                high=diff
        return low