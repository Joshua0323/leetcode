class Solution(object):
    def canPartition(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        # result = True
        # temp = sorted(nums)

        # n = len(sorted(nums))
        # max = temp[n - 1]
        # sums = 0

        # for i in range(n - 1):
        #     sums = sums + temp[i]

        # if sums != max:
        #     result = False

        total = sum(nums)
        if total % 2 != 0:
            return False

        target = total // 2
        dp = set([0])


        for num in nums:
            dp |= {num + t for t in dp}

        return target in dp