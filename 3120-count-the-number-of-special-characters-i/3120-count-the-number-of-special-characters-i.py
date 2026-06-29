class Solution(object):
    def numberOfSpecialChars(self, word):
        smallFrq = [0]*26
        largeFrq = [0]*26
        cnt = 0
        for w in word:
            if w.isupper():
                largeFrq[ord(w)-ord('A')]+=1
            else:
                smallFrq[ord(w)-ord('a')]+=1

        for i in range(26):
            if(smallFrq[i]>0 and largeFrq[i]>0):
                cnt+=1
            
        return cnt


        """s=
        :type word: str
        :rtype: int
        """
        