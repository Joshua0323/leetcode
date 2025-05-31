class Solution(object):
    def clearDigits(self, s):
        """
        :type s: str
        :rtype: str
        """
        res = ""
        for i in s:
            if i.isdigit():
                res = res[:-1]
            else:
                res += i

        return res