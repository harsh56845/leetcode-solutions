class Solution(object):
    def sumGame(self, num):
        # diff * (leftQm-rightQm)/2
    #     ?329 5???  (14-5)=9
    # A   9329 5???  (23,5) (?=9)
    # B   9329 59??  (23-5)=18, (?=9), (23,14)
    # A   9329 59??  (23-14)=9 
        n = len(num)
        # if n%2 == 1:
        #     return True
        leftSum,rightSum = 0,0
        leftQm,rightQm = 0,0

        for i in range(n//2):
            if num[i]!='?':
                leftSum+=int(num[i])
            else:
                leftQm += 1

            if num[n-i-1]!='?':
                rightSum+=int(num[n-i-1])
            else:
                rightQm +=1

        if (leftQm+rightQm) %2 ==1:
            return True

        return (leftSum-rightSum)!=(rightQm-leftQm)//2 * 9 

        
