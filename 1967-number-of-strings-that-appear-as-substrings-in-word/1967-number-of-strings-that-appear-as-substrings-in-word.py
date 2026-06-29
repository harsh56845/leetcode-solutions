class Solution(object):
    def numOfStrings(self, patterns, word):
        cnt = 0

        for p in patterns:
            if p in word:
                cnt+=1

        return cnt
        """
        :type patterns: List[str]
        :type word: str
        :rtype: int
        """
        