class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        result = True
        start_index = 0
        temp = []


        for i in range(len(nums) - 1):
            if nums[i] > nums[i + 1]:
                start_index = i + 1
        print(start_index)

        for i in range(start_index, len(nums)):
            temp.append(nums[i])

        for i in range(start_index):
            temp.append(nums[i])
        
        for i in range(len(temp) - 1):
            if temp[i] > temp[i + 1]:
                result = False

        print(temp)
        



        # for i in range(len(temp) - 1):
        #     if temp[i] > temp[i + 1]:
        #         result = False


        return result

        return result
            
            