class Solution(object):
    def longestSubsequence(self, nums):
        total = 0
        nz = 0
        
        for n in nums:
            nz = nz | (n>0)
            total = total^n

        if(total!=0):
            return len(nums)
        
        if(nz==True):
            return len(nums)-1
        
        return 0