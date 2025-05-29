class Solution(object):
    def divideArray(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        from collections import Counter
        result = True

        count = Counter(nums)

        my_dict1_values = list(count.values())

        for i in my_dict1_values:
            if i % 2 != 0:
                result = False

        return result

