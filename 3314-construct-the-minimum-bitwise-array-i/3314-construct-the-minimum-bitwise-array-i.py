class Solution(object):
    def minBitwiseArray(self, nums):
        ans = []
        for x in nums:
            if x == 2:
                ans.append(-1)
            else:
                bit = (x+1) & -(x+1)
                ans.append(x-(bit>>1))
        return ans

        """
        :type nums: List[int]
        :rtype: List[int]
        """
        