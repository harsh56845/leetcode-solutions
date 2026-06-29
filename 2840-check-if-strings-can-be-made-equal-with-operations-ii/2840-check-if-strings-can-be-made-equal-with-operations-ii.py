class Solution(object):
    def checkStrings(self, s1, s2):
        frq = [0]*52

        for i,(a,b) in enumerate(zip(s1,s2)):
            off = (i&1)*26
            frq[ord(a)-97+off]+=1
            frq[ord(b)-97+off]-=1

        for f in frq:
            if(f!=0):
                return False
        
        return True
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        