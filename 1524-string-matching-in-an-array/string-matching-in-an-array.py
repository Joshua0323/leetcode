class Solution(object):
    def stringMatching(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        res = []
        for w in words:
            for i in range(len(words)):
                if w in words[i] and w != words[i]:
                    res.append(w)
                    break
        
        return res
