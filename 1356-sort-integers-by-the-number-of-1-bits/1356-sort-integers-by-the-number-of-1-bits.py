class Solution(object):
    def count_bits(self,n):
        count = 0
        while n:
            n &= (n - 1)
            count += 1
        return count

    def sortByBits(self, arr):
        frq = dict()
        n = len(arr)
        for i in range(n):
            frq[i] = self.count_bits(arr[i])
            # print(frq[i])
        # sorted_items = sorted(frq.items(), key=lambda x: x[1])
        sorted_items = sorted(frq.items(), key=lambda x: (x[1], arr[x[0]]))
        # print(sorted_items)
        ans = []
        for i in sorted_items:
            ans.append(arr[i[0]])
        return ans
        """
        :type arr: List[int]
        :rtype: List[int]
        """
        