class Solution(object):
    def minInsertions(self, s):
        res=0
        insertion=0
        collective_weight=0
        for c in s:
            if c=='(':
                collective_weight+=2
                if collective_weight%2!=0:
                    insertion+=1
                    collective_weight-=1
                
            if c==')':
                collective_weight-=1
                if collective_weight<0:
                    insertion+=1
                    collective_weight+=2

        return collective_weight+insertion 