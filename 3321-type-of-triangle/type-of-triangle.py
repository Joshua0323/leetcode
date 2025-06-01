class Solution(object):
    def triangleType(self, nums):
        """
        :type nums: List[int]
        :rtype: str
        """
        res = ""

        if nums[0] + nums[1] > nums[2] and nums[0] + nums[2] > nums[1] and nums[1] + nums[2] > nums[0]:
            if nums[0] == nums[1] and nums[0] == nums[2]:
                res = "equilateral"
            elif nums[0] == nums[1] or nums[1] == nums[2] or nums[0] == nums[2]:
                res = "isosceles"
            else :
                res = "scalene"
        else:
            res = "none"
        

        
        
        return res
