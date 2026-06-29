class Solution(object):
    def isAnagram(self, s, t):
        frq = [0]*26
        for ch in s:
            frq[ord(ch)-ord('a')]+=1

        for ch in t:
            frq[ord(ch)-ord('a')]-=1

        for f in frq:
            if(f!=0):
                return False

        return True

        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        