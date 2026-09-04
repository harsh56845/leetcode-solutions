class Solution(object):
    def firstStableIndex(self, nums, k):
        n = len(nums)
        postFix = [0]*n

        for i in range(n-1,-1,-1):
            if i<(n-1):
                postFix[i] = min(nums[i],postFix[i+1])
            else:
                postFix[i]=nums[i]
                
        smallDiff = 9999999
        ansIdx = -1
        currMax = -99999999
        for i in range(n):
            currMax = max(currMax,nums[i])
            diff = abs(currMax-postFix[i])
            if diff<=k:
                return i 
                # and smallDiff>diff:
                # smallDiff = min(smallDiff,diff)
                # ansIdx = i

        return ansIdx

