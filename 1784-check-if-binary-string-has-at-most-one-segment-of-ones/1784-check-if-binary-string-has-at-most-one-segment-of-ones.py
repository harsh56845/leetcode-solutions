class Solution(object):
    def checkOnesSegment(self, s):
        cntOne = 0
        one = 0
        zero = 0
        for i in s:
            if(i=='1' and zero==0):
                one = 1
            if(i=='1' and zero==1 and one==1):
                return False
            if(i=='0'):
                zero=1
        
        return True
        """
        :type s: str
        :rtype: bool
        """
        