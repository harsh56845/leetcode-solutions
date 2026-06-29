class Solution(object):
    def check(self, nums):
        rot = 0
        for i in range(len(nums)-1):
            if(nums[i]>nums[i+1]):
                if(rot==1): return False
                else: rot=1

        if(rot==1 and nums[0]<nums[-1]):
            return False
        return True
        """
        :type nums: List[int]
        :rtype: bool
        """
        