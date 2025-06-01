class Solution(object):
    def getLongestSubsequence(self, words, groups):
        """
        :type words: List[str]
        :type groups: List[int]
        :rtype: List[str]
        """
        n = len(words)
        order = -1
        res = []
        for i in range(n):
            if groups[i] != order:
                order = groups[i]
                res.append(words[i])
        return res