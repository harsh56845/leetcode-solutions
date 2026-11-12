class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        if(len(nums)==1): return 1
        no = nums[0]
        dec = 1
        inc = 1
        decC = 1
        incC = 1
        for i in range(0,len(nums)):
            if(nums[i]>no):
                decC = 1
                no = nums[i]
                incC+=1
                inc = max(incC,inc)
            elif(nums[i]==no):
                decC = 1
                incC = 1
            else:
                incC = 1
                no = nums[i]
                decC+=1
                dec = max(decC,dec)
            
        return max(inc,dec)