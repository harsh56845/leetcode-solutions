class Solution(object):
    def subtractProductAndSum(self, n):
        pro = 1
        summ = 0

        while(n!=0):
            rem = n%10
            pro*=rem
            summ+=rem

            n//=10

        return pro-summ