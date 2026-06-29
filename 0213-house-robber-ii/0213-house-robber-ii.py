class Solution(object):
    def robbed(self, nums):
        prev1 =0
        prev2 =0
        for num in nums:
            curr = max(prev1,num+prev2)
            prev2 = prev1
            prev1 = curr
        return prev1 

    def rob(self, nums):
        if len(nums)==1:
            return nums[0]
        return max(self.robbed(nums[0:(len(nums)-1)]),self.robbed(nums[1:]))
        """
        :type nums: List[int]
        :rtype: int
        """
        