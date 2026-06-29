class Solution(object):
    def minMoves(self,nums,limit):
        n=len(nums)
        diff=[0]*(2*limit+2)
        for i in range(n//2):
            a=min(nums[i],nums[n-i-1])
            b=max(nums[i],nums[n-i-1])
            diff[2]+=2
            diff[a+1]-=1
            diff[a+b]-=1
            diff[a+b+1]+=1
            diff[limit+b+1]+=1
        min_ops=n
        oprs=0
        for i in range(2,2*limit+1):
            oprs+=diff[i]
            if oprs<min_ops:
                min_ops=oprs
        return min_ops