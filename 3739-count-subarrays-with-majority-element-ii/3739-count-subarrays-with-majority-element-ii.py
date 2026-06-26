from bisect import bisect_left

class Fenwick:
    def __init__(self,n):
        self.bit = [0] * (n + 1)

    def update(self,i,val):
        while i < len(self.bit):
            self.bit[i] += val
            i += i & -i

    def query(self,i):
        s = 0
        while i > 0:
            s += self.bit[i]
            i -= i & -i
        return s


class Solution:
    def countMajoritySubarrays(self,nums,target):
        prefix = [0]
        s = 0

        for x in nums:
            if x == target:
                s += 1
            else:
                s -= 1
            prefix.append(s)

        vals = sorted(set(prefix))
        bit = Fenwick(len(vals))

        ans = 0

        idx = bisect_left(vals,prefix[0]) + 1
        bit.update(idx, 1)

        for p in prefix[1:]:
            idx = bisect_left(vals,p) + 1
            ans += bit.query(idx - 1)  
            bit.update(idx,1)

        return ans