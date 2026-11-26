class Solution:
    def canAliceWin(self, n: int) -> bool:
        aliceWin = False
        if n<10: return False

        currNum = 10
        while n>=currNum: 
            aliceWin = not aliceWin
                
            n-=currNum
            currNum-=1
        
        return aliceWin

