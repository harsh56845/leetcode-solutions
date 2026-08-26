class Solution(object):
    def countAsterisks(self, s):
        ans,switch = 0,True

        for i in range(len(s)):
            if s[i]=='|': 
				switch^= True 
            elif switch and s[i]=='*':
				ans+= 1

        return ans