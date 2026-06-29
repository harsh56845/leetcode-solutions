class Solution(object):
    def maxDistance(self, nums1, nums2):
        i = 0
        j = 0
        n = len(nums1)
        m = len(nums2)
        maxi = 0
        while i < n and j < m:
            if nums1[i] <= nums2[j]:
                maxi = max(maxi, j - i)
                j += 1
            else:
                i += 1
                if i > j:
                    j = i
        return maxi
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: int
        """
        