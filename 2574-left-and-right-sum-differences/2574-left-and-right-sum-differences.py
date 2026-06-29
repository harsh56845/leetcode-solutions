class Solution(object):
    def leftRightDifference(self, nums):
        n = len(nums)
        rightSum = 0
        leftSum = 0
        ans = [0]*n
        for n in nums:
            rightSum+=n
        
        for i,n in enumerate(nums):
            rightSum-=n
            ans[i]=abs(rightSum-leftSum)
            leftSum+=n
        
        return ans

        """
        :type nums: List[int]
        :rtype: List[int]
        """
        