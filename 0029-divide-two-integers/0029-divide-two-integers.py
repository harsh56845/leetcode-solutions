class Solution(object):
    def divide(self, dividend, divisor):

        isNeg = (dividend<0) != (divisor<0)

        dividend = abs(dividend)
        divisor = abs(divisor)
        
        qut = 0

        while dividend>=divisor:

            val = divisor
            mul = 1

            while dividend >= (val<<1):
                val = val<<1
                mul = mul<<1

            dividend -= val
            qut += mul

        if isNeg is True:
             qut = -qut
        
        if qut > 2**31-1:
            return 2**31-1

        if qut<-2**31:
            return -2**31

        return qut

