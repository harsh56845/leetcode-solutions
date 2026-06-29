class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        maxPrice = max(costs)
        minPrice = min(costs)
        totalPrice = 0

        if(minPrice>coins): return 0

        counts = [0]*(maxPrice+1)

        for i,c in enumerate(costs):
            counts[c]+=1
            totalPrice+=c
            # print(f"{i} = {counts[c]} and {totalPrice}")

        if(totalPrice<=coins): return len(costs)


        result = []

        for c in range(0,len(counts)):
            result.extend([c] * counts[c])
            # print(f"{c} = {counts[c]} ")


        ans = 0

        for r in result:
            if(r<=coins):
                ans+=1
                coins-=r
            else:
                break
        
        return ans

        
        