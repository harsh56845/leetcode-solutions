class Solution(object):
    def stoneGame(self, piles):
        n = len(piles)
        i = 0
        j = n-1
        aSum = 0
        bSum = 0

        while(i<=j):

            if(piles[i]>piles[j]):
                aSum+=piles[i]
                i+=1
            else:
                aSum+=piles[j]
                j-=1
            
        
        return aSum>bSum