class Solution(object):
    def characterReplacement(self, s, k):

        frq = [0]*26
        n = len(s)
        kn = k
        i=0
        ans = 0
        maxFreq = 0

        for j in range(n):
            frq[ord(s[j])-ord('A')]+=1

            maxFreq = max(maxFreq,frq[ord(s[j])-ord('A')])

            wLen = j-i+1
            rpl = wLen-maxFreq

            while rpl > k:

                frq[ord(s[i])-ord('A')]-=1
                i += 1

                wLen = j-i+1
                rpl = wLen-maxFreq

            ans = max(ans,j-i+1)
            

        
        return ans