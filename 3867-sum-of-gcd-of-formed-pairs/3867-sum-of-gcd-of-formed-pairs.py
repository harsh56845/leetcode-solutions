class Solution(object):
    def gcd(self,a,b):
        if(b==0):
            return a
        return self.gcd(b,a%b)

    def gcdSum(self, nums):
        n = len(nums)
        dums = [0]*n

        preMax = nums[0]

        for i in range(n):
            preMax = max(preMax,nums[i])
            dums[i] = self.gcd(preMax,nums[i])

        dums.sort()
        ans = 0

        i = 0
        j = n-1

        while(i<j):
            ans += self.gcd(dums[i],dums[j])
            i+=1
            j-=1
        
        return ans
