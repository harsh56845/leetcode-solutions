# class Solution(object):
#     def minOperations(self, s):
#         prev = ''
#         cnt = 0
#         for ch in s:
#             if(prev==''):
#                 prev = ch
#             elif(prev=='0'):
#                 if(ch=='0'):
#                     cnt+=1
#                     prev = '1'
#                 else:
#                     prev = ch
#             else:
#                 if(ch=='1'):
#                     cnt+=1
#                     prev = '0'
#                 else:
#                     prev = ch
                    
#         return cnt
#         """
#         :type s: str
#         :rtype: int
#         """
        

class Solution(object):
    def minOperations(self, s):
        prev = ''
        cnt1 = 0
        cnt2 = 0

        for i in range(len(s)):
            if(i%2==0):
                if(s[i]=='0'):
                    cnt1+=1
                else:
                    cnt2+=1
            else:
                if(s[i]=='1'):
                    cnt1+=1
                else:
                    cnt2+=1
                    
        return min(cnt1,cnt2)
        """
        :type s: str
        :rtype: int
        """
        