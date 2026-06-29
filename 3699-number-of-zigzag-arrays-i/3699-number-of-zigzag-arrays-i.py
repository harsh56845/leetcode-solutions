class Solution:
    def zigZagArrays(self, n: int, l: int, r: int) -> int:
        MOD = 10**9 + 7

        k = r-l+1

        up = [i for i in range(k)]
        down = [k-1-i for i in range(k)]

        for length in range(3,n+1):

            prefix = [0]*k
            prefix[0] = down[0]

            for i in range(1,k): 
                prefix[i] = (prefix[i-1]+down[i])%MOD

            suffix = [0]*k
            suffix[-1] = up[-1]

            for i in range(k-2,-1,-1):
                suffix[i] = (suffix[i+1]+up[i])%MOD

            new_up = [0]*k
            new_down = [0]*k

            for i in range(k):

                if i>0:
                    new_up[i]=prefix[i-1]

                if i<k-1:
                    new_down[i]=suffix[i+1]

            up = new_up
            down = new_down

        return (sum(up)+sum(down))%MOD
        