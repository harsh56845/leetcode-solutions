class Solution(object):
    def closestTarget(self, words, target, startIndex):
        n = len(words)
        for i in range(n//2 + 1):
            if ((words[(startIndex+i)%n]==target) or (words[(startIndex-i+n)%n]==target)):
                return i
        return -1
        """
        :type words: List[str]
        :type target: str
        :type startIndex: int
        :rtype: int
        """
        