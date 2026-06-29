class Solution(object):
    def minElement(self, nums):
        mini = 99999999
        for i in nums:
            summ = 0
            num = i
            while(num!=0):
                summ+=num%10
                num/=10
            mini = min(mini,summ)
        return mini

        """
        :type nums: List[int]
        :rtype: int
        """
        