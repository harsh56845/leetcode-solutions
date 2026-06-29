class Solution(object):
    def processStr(self, s, k):
        lengths = []
        length = 0

        for ch in s:

            # ch = s[i]

            if ch.isalpha():
                length+=1
            elif ch=='*':
                length = max(0,length-1)
            elif ch=='#':
                length *= 2
            
            lengths.append(length)

        if k>=length:
            return '.'
        
        for i in range(len(s)-1,-1,-1):
        # for ch in s:

            ch = s[i]

            prev = 0
            if(i>0):
                prev = lengths[i-1]

            if ch.isalpha():
                if k==prev:
                    return ch

            elif ch=='#':
                k = k%prev

            elif ch=='%':
                k = prev-1-k
        
        return '.'
