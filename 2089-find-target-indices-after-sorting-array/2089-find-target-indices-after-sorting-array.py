class Solution(object):
    def targetIndices(self, nums, target):
        no_of_small_value = 0
        for n in nums:
            if n<target:
                no_of_small_value+=1
        
        ans = []
        
        for n in nums:
            if n == target:
                ans.append(no_of_small_value)
                no_of_small_value+=1
        
        return ans
        