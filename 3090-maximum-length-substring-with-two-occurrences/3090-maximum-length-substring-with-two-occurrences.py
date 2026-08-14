class Solution(object):
    def maximumLengthSubstring(self, s):
        i = 0
        j = 0
        n = len(s)

        frq = [0]*26
        maxAns = 0
        while(j<n):

            frq[ord(s[j])-ord('a')]+=1

            while(frq[ord(s[j])-ord('a')]>2):
                frq[ord(s[i])-ord('a')]-=1
                i+=1
            


            maxAns = max(maxAns,j-i+1)

            j+=1

        
        return maxAns