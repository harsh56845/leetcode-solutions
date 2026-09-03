class Solution(object):
    def uniformArray(self, nums1):
        minNum = min(nums1)

        if minNum%2 == 1:
            return True

        for num in nums1:
            if num%2 == 1:
                return False

        return True