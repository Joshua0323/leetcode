class Solution(object):
    def countPrefixSuffixPairs(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        count = 0
        # print(words[0] == words[1][:len(words[0])])
        # print(words[1][:len(words[0])])
        # print(words[1][-len(words[0]):])
        # print(words[0] == words[1][0:len(words[0])])

        

        for i in range(len(words)):
            for j in range(len(words)):
                if words[i] == words[j][:len(words[i])] and words[i] == words[j][-len(words[i]):] and i < j:
                    count += 1

        return count