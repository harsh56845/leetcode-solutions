class Solution(object):
    def minimumDistance(self, nums):
        n = len(nums)
        minDis = float('inf')
        #  n
        # for i in range(n):
        #     j = i+1
        #     k = n-1
            # while(j<k):
            #     if(nums[i]!=nums[j]):
            #         j+=1
            #     elif(nums[k]!=nums[i]):
            #         k-=1
            #     elif(nums[i]==nums[j] and nums[i]==nums[k]):
            #         minDis = min(minDis,(2*(k-i)))
            #         j+=1
            #         k-=1
        # for i in range(n):
        #     j = i+1
        #     k = i+2  
            
        #     while j<n:
        #        while k<n and nums[k]!=nums[i]:
        #             k+=1

        #        if k<n and nums[j]==nums[i]:
        #             minDis = min(minDis, 2 * (k - i))
        #        j += 1
        #        if k<=j:
        #         k=j+1

        for i in range(n):
            for j in range(i+1,n):
                if nums[j]!=nums[i]:
                    continue
                for k in range(j+1, n):
                    if nums[k]==nums[i]:
                        minDis = min(minDis,2*(k - i))
        
        return minDis if minDis != float('inf') else -1
        # return minDis if minDis!=n else -1


        """
        :type nums: List[int]
        :rtype: int
        """
        