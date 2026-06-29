class Solution(object):
    def findThePrefixCommonArray(self, A, B):
        n = len(A)
        fr1 = [False]*(n+1)
        fr2 = [False]*(n+1)
        ans = [0]*n
        cnt = 0
        for i in range(0,n):
            if(fr2[A[i]]):
                cnt+=1

            if(fr1[B[i]]):
                cnt+=1
            
            if(A[i]==B[i]):
                cnt+=1

            ans[i]=cnt

            fr1[A[i]]=True
            fr2[B[i]]=True
        return ans


        """
        :type A: List[int]
        :type B: List[int]
        :rtype: List[int]
        """
        