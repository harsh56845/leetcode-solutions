class Solution(object):
    def digitSum(self,num):
        dSum = 0
        while num!=0:
            dSum = dSum + num%10
            num//=10
        return dSum

    def smallestIndex(self, nums):

        for i in range(len(nums)):
            if self.digitSum(nums[i]) == i:
                return i
            
        return -1
