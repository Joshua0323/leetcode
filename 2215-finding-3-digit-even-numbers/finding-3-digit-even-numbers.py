from collections import Counter

class Solution(object):
    def findEvenNumbers(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """

        counter = Counter(digits)
        result = []

        for num in range(100, 1000, 2):  # all 3-digit even numbers
            num_digits = [int(d) for d in str(num)]
            temp_counter = Counter(num_digits)
            if all(temp_counter[d] <= counter[d] for d in temp_counter):
                result.append(num)

        return result
        

        