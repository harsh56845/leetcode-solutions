class Solution:
    def countMajoritySubarrays(self, nums: List[int], target: int) -> int:
        ans = 0
        n = len(nums)

        for i in range(n):

            tar_sum = 0

            for j in range(i,n):

                if(nums[j]==target): tar_sum+=1

                sub_len = j-i+1

                if(sub_len//2<tar_sum):
                    ans+=1

        
        return ans