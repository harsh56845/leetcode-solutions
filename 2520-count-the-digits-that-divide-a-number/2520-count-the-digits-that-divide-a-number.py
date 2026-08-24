class Solution(object):
    def countDigits(self, num):
        cnt = 0
        n = num

        while(n!=0):
            if num%(n%10)==0:
                cnt+=1
            n//=10
        
        return cnt