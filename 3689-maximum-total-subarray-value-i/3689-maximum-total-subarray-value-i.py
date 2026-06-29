class Solution(object):
    def maxTotalValue(self, nums, k):
        return k*(max(nums)-min(nums))
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        