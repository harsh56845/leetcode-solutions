from collections import defaultdict
import bisect
class Solution(object):
    def solveQueries(self, a, q):
        n=len(a);d=defaultdict(list)
        for i,v in enumerate(a):d[v].append(i)
        r=[]
        for x in q:
            b=d[a[x]]
            if len(b)<2:r.append(-1);continue
            i=bisect.bisect_left(b,x)
            l=b[i-1];rr=b[(i+1)%len(b)]
            d1=abs(x-l);d2=abs(x-rr)
            r.append(min(d1,n-d1,d2,n-d2))
        return r
        # n=len(nums)
        # return [min([min(abs(q-i),n-abs(q-i)) for i,v in enumerate(nums) if v==nums[q] and i!=q] or [-1]) for q in queries]
        """
        :type nums: List[int]
        :type queries: List[int]
        :rtype: List[int]
        """
        