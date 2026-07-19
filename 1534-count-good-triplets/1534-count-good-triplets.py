class Solution(object):
    def countGoodTriplets(self, arr, a, b, c):
        cnt = 0
        for i in range(len(arr)):
            for j in range(i+1,len(arr)):
                for k in range(j+1,len(arr)):
                    sumA = abs(arr[i]-arr[j])
                    sumB = abs(arr[j]-arr[k])
                    sumC = abs(arr[i]-arr[k])
                    if(sumA<=a and sumB<=b and sumC<=c):
                        cnt+=1
        
        return cnt

        """
        :type arr: List[int]
        :type a: int
        :type b: int
        :type c: int
        :rtype: int
        """
        