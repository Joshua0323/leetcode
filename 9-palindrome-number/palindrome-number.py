class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        nums = str(abs(x))
        n = len(str(x))

        first_half = []
        second_half = []
        res = True

        if x < 0:
            return False
        elif x < 10:
            return res
        elif x == 10:
            return False
        elif x < 100 and (x % 10 == x / 10):
            return res

        for i in range(n/2):
            first_half.append(nums[i])
            second_half.append(nums[-i-1])
            if first_half[i] != second_half[i]:
                return False

        print(first_half)
        print(second_half)

        return res

