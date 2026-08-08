class Solution(object):
    def singleNumber(self, nums): # nums = [1,2,1,3,2,5]
        xor = 0 # nums = [x,x,x,3,x,5] => 0011(a) ^ 0101(b) => 0110(6) // 

        for n in nums: 
            xor ^=n 

        diff = xor & -xor # 0110(6) & 1010(-6) => 0010(2) [5-3=2]
        # 6->0110 ,1's->1001, 2's -> 1010
        a = 0
        b = 0

        for n in nums:
            if n & diff:
                a^=n
            else:
                b^=n
        
        return [a,b]

        