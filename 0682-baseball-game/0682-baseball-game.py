# 


class Solution(object):
    def calPoints(self, operations):
        prev1 = 0
        prev2 = 0
        prev3 = 0
        prev4 = 0
        prev5 = 0
        prev6 = 0
        prev7 = 0
        prev8 = 0
        prev9 = 0

        ans = 0

        for op in operations:
            if op=="C":
                ans-=prev1
                prev1=prev2
                prev2=prev3
                prev3=prev4
                prev4=prev5
                prev5=prev6
                prev6=prev7
                prev7=prev8
                prev8=prev9

            elif op=="D":
                prev9=prev8
                prev8=prev7
                prev7=prev6
                prev6=prev5
                prev5=prev4
                prev4=prev3
                prev3=prev2
                prev2=prev1
                prev1=prev2*2
                ans+=prev1

            elif op=="+":
                newScr=prev1+prev2
                prev9=prev8
                prev8=prev7
                prev7=prev6
                prev6=prev5
                prev5=prev4
                prev4=prev3
                prev3=prev2
                prev2=prev1
                prev1=newScr
                ans+=prev1

            else:
                ans+=int(op)
                prev9=prev8
                prev8=prev7
                prev7=prev6
                prev6=prev5
                prev5=prev4
                prev4=prev3
                prev3=prev2
                prev2=prev1
                prev1=int(op)

        return ans