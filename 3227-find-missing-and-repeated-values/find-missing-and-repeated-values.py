class Solution(object):
    def findMissingAndRepeatedValues(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: List[int]
        """
        n = len(grid)
        temp, res = [], []
        for g in grid:
            for i in g:
                if i in temp:
                    res.append(i)
                temp.append(i)
        temp = sorted(temp)

        for i in range(1, n*n + 1):
            if not(i in temp):
                res.append(i)
        
        return res