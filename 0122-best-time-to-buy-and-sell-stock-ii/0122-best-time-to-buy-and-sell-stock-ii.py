class Solution(object):
    def maxProfit(self, prices):
        prev = prices[0]
        totalProfit = 0
        for i in range(1,len(prices)):
            
            if(prices[i]>prev):
                totalProfit+=(prices[i]-prev)
            
            prev = prices[i]
        return totalProfit
        




        """
        :type prices: List[int]
        :rtype: int
        """
        