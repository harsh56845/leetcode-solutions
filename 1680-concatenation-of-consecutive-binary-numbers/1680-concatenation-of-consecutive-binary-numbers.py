class Solution:
    def concatenatedBinary(self, n: int) -> int:
        strr = ""
        for i in range(1,n+1):
            strr += bin(i)[2:]
        # print(strr)
        return int(strr,2) % (10**9 + 7)
        