class Solution(object):
    def concatWithReverse(self, nums):
        return nums + nums[::-1]
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        