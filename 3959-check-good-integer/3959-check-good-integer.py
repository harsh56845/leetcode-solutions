class Solution(object):
    def checkGoodInteger(self, n):
        squareSum = 0
        digitSum = 0
        while n!=0:
            rem = n%10
            squareSum+= rem*rem
            digitSum+=rem
            n//=10
        
        return squareSum-digitSum>=50
        """
        :type n: int
        :rtype: bool
        """
        