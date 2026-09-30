class Solution(object):
    def maxDepthAfterSplit(self, seq):
        ans = []

        for i in range(len(seq)):
            ans.append((i^ord(seq[i]))&1)

        return ans