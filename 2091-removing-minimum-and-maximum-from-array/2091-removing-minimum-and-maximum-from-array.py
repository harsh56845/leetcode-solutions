class Solution(object):
    def minimumDeletions(self, nums):
        maxPos = 0
        minPos = 0
        n = len(nums)

        for i in range(n):
            if nums[i]>nums[maxPos]:
                maxPos = i
            if nums[i]<nums[minPos]:
                minPos = i

        left = min(minPos,maxPos)
        right = max(minPos,maxPos)

        bf = right + 1
        bb = n - left
        b = (left+1) + (n-right)

        ans =  min(bf,bb,b)
        # i = 0
        # ans = min(minPos+i+1,n-minPos)

        # if ans==minPos+i+1:
        #     i = minPos
        # else:
        #     n = minPos

        # ans = min(maxPos+i+1,n-maxPos)

        return ans

        