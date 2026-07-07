class Solution:
    def sumAndMultiply(self, n: int) -> int:

        if(n==0): return 0
        summ = 0
        concat = ""

        for ch in str(n):
            if(ch!='0'):
                concat+=ch
                summ+=int(ch)
        
        return int(concat)*summ

        