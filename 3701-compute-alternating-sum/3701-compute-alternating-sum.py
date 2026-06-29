class Solution(object):
    def alternatingSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = 0
        for i in range(len(nums)):
            if(i%2==0):
                ans += nums[i]
            else :
                ans -= nums[i]
        return ans
        