class Solution(object):
    def countWaviness(self,num):
        cnt = 0
        n = str(num)
        for i in range(1,len(n)-1):
            if(n[i]>n[i+1] and n[i]>n[i-1]):
                cnt+=1
            if(n[i]<n[i+1] and n[i]<n[i-1]):
                cnt+=1
        return cnt

    def totalWaviness(self, num1, num2):
        total = 0
        for i in range(num1,num2+1):
            total += self.countWaviness(i)
        return total
        """
        :type num1: int
        :type num2: int
        :rtype: int
        """
        