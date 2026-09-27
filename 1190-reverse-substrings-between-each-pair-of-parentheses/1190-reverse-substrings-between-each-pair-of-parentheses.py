class Solution(object):
    def reverseParentheses(self, s):
        stack = []

        for ch in s:
            if ch!=')':
                stack.append(ch)
            else:
                s1 = []
                while stack[-1]!='(':
                    s1.append(stack.pop())
                
                stack.pop()
                for s1char in s1:
                    stack.append(s1char)

        return "".join(stack)


        """
        :type s: str
        :rtype: str
        """
# (ed(et(oc))el)
# le   (et(oc))   de
# le octe de
# le etco de
# leetcode