class Solution(object):
    def mapWordWeights(self, words, weights):
        sol = []
        for wrd in words:
            aplbSum = 0
            for ch in wrd:
                aplbSum += weights[ord(ch)-ord('a')]
            sol.append(chr(ord('z') - aplbSum%26))
        
        return ''.join(sol)

        """
        :type words: List[str]
        :type weights: List[int]
        :rtype: str
        """
        