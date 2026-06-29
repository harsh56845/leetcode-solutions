class Solution(object):
    def separateDigits(self, nums):
        ans = []
        for num in nums:
            n1 = str(num)

            for n in n1:
                ans.append(int(n))
            # n1 = num
            # nr = 0
            # while(n1!=0):
            #     nr = nr*10 + n1%10
            #     n1/=10

            # while(nr!=0):
            #     ans.append(nr%10)
            #     nr/=10
        
        return ans


        """
        :type nums: List[int]
        :rtype: List[int]
        """
        