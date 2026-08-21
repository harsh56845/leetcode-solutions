class Solution(object):
    def xorOperation(self, n, start):
        ans = 0
        while n!=0:
            ans ^= start
            start+=2
            n-=1
        
        return ans
