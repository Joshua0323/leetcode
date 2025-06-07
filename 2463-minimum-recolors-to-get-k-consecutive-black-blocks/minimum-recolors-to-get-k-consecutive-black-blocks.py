class Solution(object):
    def minimumRecolors(self, blocks, k):
        """
        :type blocks: str
        :type k: int
        :rtype: int
        """
        w = blocks[:k].count('W')
        m = w
        for i in range(k, len(blocks)):
            if blocks[i-k] == 'W':
                w -= 1
            if blocks[i] == 'W':
                w += 1
            m = min(m, w)
        return m
