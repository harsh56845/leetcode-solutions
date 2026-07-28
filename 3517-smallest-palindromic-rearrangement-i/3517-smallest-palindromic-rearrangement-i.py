class Solution(object):
    def smallestPalindrome(self, s):
        n = len(s)

        middle = ""
        leftHalf = []

        if(n%2==1):
            middle = s[n//2]

        frq = [0]*26
        for i in range(n//2):
            frq[ord(s[i])-ord('a')]+=1

        for i in range(26):
            while(frq[i]!=0):
                leftHalf.append(chr(i+ord('a')))
                frq[i]-=1
        
        return "".join(leftHalf) + middle + "".join(leftHalf[::-1])

