class Solution(object):
    def distance(self, nums):
        d = defaultdict(list)
        for i, num in enumerate(nums):
            d[num].append(i)
        arr = [0] * len(nums)
        for idxs in d.values():
            k = len(idxs)
            l = 0          # prefix sum
            r = sum(idxs)  # suffix sum
            for j, idx in enumerate(idxs, start=1):
                r -= idx
                arr[idx] = r - l + idx * (2 * j - k - 1)
                l += idx
        return arr
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        