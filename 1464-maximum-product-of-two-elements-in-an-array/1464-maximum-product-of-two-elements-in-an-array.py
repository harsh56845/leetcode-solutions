class Solution(object):
    def maxProduct(self, nums):

        ans = 1
        for _ in range(2):
            # max1 = nums[i]
            maxi = 0
            for j in range(len(nums)):
                if(nums[j]>nums[maxi]):
                    maxi = j
            ans*=(nums[maxi]-1)
            nums[maxi] = 0
        return ans
                

