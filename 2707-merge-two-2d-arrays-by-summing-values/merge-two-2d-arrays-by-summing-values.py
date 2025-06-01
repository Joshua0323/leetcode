class Solution(object):
    def mergeArrays(self, nums1, nums2):
        """
        :type nums1: List[List[int]]
        :type nums2: List[List[int]]
        :rtype: List[List[int]]
        """
        res = {}
        
        for i, v in nums1:
            res[i] = res.get(i,0) + v
        for i, v in nums2:
            res[i] = res.get(i,0) + v

        # print(sorted(res.items()))
        return sorted(res.items())