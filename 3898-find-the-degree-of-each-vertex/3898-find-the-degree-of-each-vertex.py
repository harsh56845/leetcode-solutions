class Solution(object):
    def findDegrees(self, matrix):
        return list(map(sum, matrix))
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        