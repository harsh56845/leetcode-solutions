class Solution:
    def isBalanced(self, num: str) -> bool:
        oSum = 0
        eSum = 0
        for i in range(len(num)):
            if i%2==0:
                eSum+=int(num[i])
            else:
                oSum+=int(num[i])
        return oSum==eSum