class Solution(object):
    def pivotArray(self, nums, pivot):
        left = []
        center = []
        right = []
        
        for n in nums:
            if(n<pivot):
                left.append(n)
            elif(n==pivot):
                center.append(n)
            else:
                right.append(n)
        
        return left+center+right


        """
        :type nums: List[int]
        :type pivot: int
        :rtype: List[int]
        """
        