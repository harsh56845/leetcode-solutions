class Solution(object):
    def findNumbers(self, nums):
        ec = 0
        for n in nums:
            if(len(str(n))%2==0):
                ec+=1
        return ec
        """
        :type nums: List[int]
        :rtype: int
        """
        