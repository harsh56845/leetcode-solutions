class Solution:
    def checkString(self, s: str) -> bool:
        isBseen = False
        for ch in s:
            if ch=='b': isBseen=True
            if ch=='a' and isBseen: return False
        return True