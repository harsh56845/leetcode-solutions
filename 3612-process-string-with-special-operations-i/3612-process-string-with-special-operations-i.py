class Solution(object):
    def processStr(self, s):
        res = []
        for ch in s:
            if ch=='#':
                res+=res
            elif ch=='*':
                if res:
                    res.pop()
            elif ch=='%':
                res.reverse()
            else :
                res.append(ch)
        
        return "".join(res)
        """
        :type s: str
        :rtype: str
        """
        