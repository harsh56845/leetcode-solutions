class Solution(object):
    def getCommon(self, nums1, nums2):

        mini = float('inf')
        frq = {}

        for n in nums1:
            frq[n]=1

        for n in nums2:
            if n in frq:
                mini = min(mini,n)

        if mini == float('inf'):
            return -1

        return mini
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: int
        """
        