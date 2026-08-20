class Solution(object):
    def resultArray(self, nums):
        list1 = []
        list2 = []

        arr1 = -1
        arr2 = -1

        for n in nums:
            if(arr1==-1):
                list1.append(n)
                arr1=n
            elif(arr2==-1):
                list2.append(n)
                arr2=n
            else:
                if arr1>arr2:
                    list1.append(n)
                    arr1=n
                else:
                    list2.append(n)
                    arr2=n
        

        return list1+list2