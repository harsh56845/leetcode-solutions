class Solution(object):
    def minOperations(self, logs):
        summ = 0
        for ch in logs:
            if ch=="../":
                if summ>0:
                    summ-=1
            elif ch=='./':
                pass
            else:
                summ+=1
        return summ
        """
        :type logs: List[str]
        :rtype: int
        """
        