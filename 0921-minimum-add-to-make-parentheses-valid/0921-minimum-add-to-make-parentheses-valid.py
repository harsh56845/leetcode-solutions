class Solution(object):
    def minAddToMakeValid(self, s):
        op = 0
        cl = 0
        for ch in s:
            if(ch=='('): op+=1
            else:
                if(op!=0): op-=1
                else: cl+=1
        return op+cl