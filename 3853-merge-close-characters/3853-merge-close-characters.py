class Solution:
    def mergeCharacters(self, s: str, k: int) -> str:
        hm = {}
        ans = ""
        offby = 0
        for i in range(len(s)):
            if s[i] not in hm:
                hm[s[i]] = i-offby
                ans += s[i]
            else:
                if i - hm[s[i]]-offby <=k:
                    offby += 1
                    continue
                else:
                    hm[s[i]] =i-offby
                    ans+=s[i]
        return ans