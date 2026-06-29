class Solution(object):
    def duplicateZeros(self, arr):
        n = len(arr)
        i,j=0,0
        drr = [0]*n
        while(j<n and i<n):
            if(arr[j]==0):
                drr[i]=0
                i+=1
                if(i<n): drr[i]=0
            else:
                drr[i]=arr[j]
            i+=1
            j+=1
        for i in range(n):
            arr[i]=drr[i]
        
        """
        :type arr: List[int]
        :rtype: None Do not return anything, modify arr in-place instead.
        """
        