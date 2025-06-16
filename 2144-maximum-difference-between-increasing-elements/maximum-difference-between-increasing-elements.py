class Solution(object):
    def maximumDifference(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max = -1
        n = len(nums)
        
        for i in range(1, n+1):
            for j in range(i + 1, n+1):
                is_max = nums[-i] - nums[-j]
                # print(nums[-i], nums[-j], nums[-i] > nums[-j])
                if is_max > max and nums[-i] > nums[-j] :
                    max = is_max

        return max            