class Solution:
    def maxLength(self, nums: List[int]) -> int:
        n = len(nums)

        def gcd(a,b):
            while b:
                a,b = b,a % b
            return a

        max_length = 0

        for i in range(n):
            prod = 1
            hcf = 0
            lcm = 1

            for j in range(i,n):
                prod *= nums[j]
                hcf = gcd(hcf,nums[j])
                lcm = (lcm * nums[j])//gcd(lcm,nums[j])

                if lcm * hcf == prod:
                    curr_length = j-i+1
                    max_length = max(max_length,curr_length)

        return max_length