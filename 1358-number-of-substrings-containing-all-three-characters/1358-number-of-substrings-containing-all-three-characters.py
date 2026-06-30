class Solution(object):
    def numberOfSubstrings(self, s):

        frq = [0]*3
        n = len(s)
        cnt = 0
        i=0
        j=0
        while(j<n):
            frq[ord(s[j])-ord('a')]+=1

            while(frq[0]>0 and frq[1]>0 and frq[2]>0):
                cnt+=(n-j)
                frq[ord(s[i])-ord('a')]-=1
                i+=1
            
            j+=1

        return cnt
        """
        :type s: str
        :rtype: int
        """
        