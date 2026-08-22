class Solution(object):
    def checkDivisibility(self, n):
        num = n

        summ,pro = 0,1

        while num!=0:
            rem = num%10
            summ += rem
            pro *= rem
            num//=10

        
        return n%(summ+pro) == 0 
            