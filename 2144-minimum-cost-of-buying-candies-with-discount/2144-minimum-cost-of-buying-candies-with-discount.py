class Solution(object):
    def minimumCost(self, cost):
        cost.sort()
        price = 0
        two = 0
        for i in range(len(cost)-1,-1,-1):
            if(two!=2):
                price+=cost[i]
                two+=1
            else:
                two = 0
        return price
        """
        :type cost: List[int]
        :rtype: int
        """
        