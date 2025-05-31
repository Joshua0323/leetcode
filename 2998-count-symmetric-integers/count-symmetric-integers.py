class Solution(object):
    def countSymmetricIntegers(self, low, high):
        """
        :type low: int
        :type high: int
        :rtype: int
        """
        count = 0
        for n in range(low, high + 1):
            char = str(n)
            if len(char) % 2 == 0:
                first_half = sum(list(map(int,str(char[:len(char)//2])))) 
                last_half = sum(list(map(int,str(char[len(char)//2:]))))
                if first_half == last_half:
                    count += 1
        return count
                
                     
            
