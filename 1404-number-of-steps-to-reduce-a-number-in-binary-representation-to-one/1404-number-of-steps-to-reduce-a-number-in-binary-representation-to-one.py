class Solution(object):
    def numSteps(self, s):
        n = int(s,2)
        setps = 0

        while n>1:
            if n%2==0:
                n=n//2
            else:
                n+=1
            setps+=1
        return setps

        """
        :type s: str
        :rtype: int
        """
        