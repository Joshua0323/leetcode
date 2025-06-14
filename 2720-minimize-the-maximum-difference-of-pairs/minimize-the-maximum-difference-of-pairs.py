class Solution(object):
    def minimizeMax(self, nums, p):
        """
        :type nums: List[int]
        :type p: int
        :rtype: int
        """
        nums.sort()
        low = 0
        high = nums[len(nums)-1] - nums[0]
        while low < high:
            i = 1
            count = 0
            curr = low + (high - low)//2
            print(curr)
            while i < len(nums):
                if nums[i] - nums[i - 1] <= curr:
                    count += 1
                    i += 1
                i += 1
            if count >= p:
                high = curr
            else:
                low = curr + 1
        return low