class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        res = {}
        for str  in strs:
            st = "".join(sorted(str))

            if st not in res:
                res[st] = []
            
            res[st].append(str)

        return list(res.values())
        