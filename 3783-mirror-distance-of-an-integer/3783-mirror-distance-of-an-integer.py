class Solution(object):
    def mirrorDistance(self, n):
        rev = 0
        num = n
        while(num!=0):
            rev = rev*10 + num%10
            num/=10
        return abs(rev-n)
        """
        :type n: int
        :rtype: int
        """
        