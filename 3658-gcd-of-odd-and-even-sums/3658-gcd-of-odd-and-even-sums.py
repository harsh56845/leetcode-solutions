class Solution:
    def gcd(a,b):
        if b==0:
            return a
        return self.gcd(b,a%b)

    def gcdOfOddEvenSums(self, n: int) -> int:
        oddSum = n*n
        evenSum = n*(n+1)

        return gcd(oddSum,evenSum)