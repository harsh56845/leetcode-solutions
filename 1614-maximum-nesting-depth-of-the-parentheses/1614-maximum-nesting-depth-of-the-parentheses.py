class Solution(object):
    def maxDepth(self, s):
        ans = 0
        cnt = 0
        for ch in s:
            if ch=='(':
                cnt += 1
            if ch==')':
                cnt -= 1
            ans = max(cnt,ans)
        
        return ans
            
        