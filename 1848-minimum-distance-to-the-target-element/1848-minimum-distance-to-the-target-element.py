class Solution(object):
    def getMinDistance(self, nums, target, start):
        minn=float('inf')
        for i in range(len(nums)):
            if nums[i]==target:
                minn=min(minn,abs(i-start))
        return minn
        """
        :type nums: List[int]
        :type target: int
        :type start: int
        :rtype: int
        """
        