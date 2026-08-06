class Solution(object):
    def smallestNumber(self, n, t):
        n1 = n
        while True:
            pro = 1
            while(n1!=0):
                pro *= n1%10 
                if(pro%t==0):
                    return n
                n1//=10
            n+=1
            n1=n