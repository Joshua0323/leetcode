class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        x2=str(x)
        num=x2[::-1]
        if num==x2:
            return True
        else:
            return False

