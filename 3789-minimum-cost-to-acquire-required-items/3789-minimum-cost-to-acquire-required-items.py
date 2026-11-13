class Solution:
    def minimumCost(self, cost1: int, cost2: int, costBoth: int, need1: int, need2: int) -> int:

        seperate = cost1*need1 + cost2*need2

        mixed = (min(need1,need2) * costBoth) + abs(need1-need2) * (cost1 if need1>need2 else cost2)

        all_both = max(need1,need2) * costBoth

        return min(seperate,mixed,all_both)