class Solution(object):
    def removeCoveredIntervals(self, intervals):
        intervals.sort(key=lambda x: (x[0],-x[1]))

        end = 0
        cnt = 0

        for s,e in intervals:
            if e>end:
                cnt+=1
                end = e

        return cnt


        """
        :type intervals: List[List[int]]
        :rtype: int
        """
        