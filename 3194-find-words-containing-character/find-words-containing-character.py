class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        res = []
        idx = 0
        for i in words:
            if x in i:
                res.append(idx)
            idx += 1
        return res  