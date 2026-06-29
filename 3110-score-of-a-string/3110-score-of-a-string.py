class Solution(object):
    def scoreOfString(self, s):
        sum1 = 0
        for i in range(1,len(s)):
            sum1 = sum1 + abs(ord(s[i])-ord(s[i-1]))
        return sum1
        """
        :type s: str
        :rtype: int
        """
        