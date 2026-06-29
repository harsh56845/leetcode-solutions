class Solution(object):
    def longestCommonPrefix(self, arr1, arr2):
        set2 = set()
        longest = 0
        for a in arr1:
            str1 = str(a)
            for i in range(len(str1)):
                set2.add(str1[0:i+1])

        for a in arr2:
            str1 = str(a)
            for i in range(len(str1)):
                if (str1[0:i+1]) in set2:
                    longest=max(longest,i+1)
        return longest
        """
        :type arr1: List[int]
        :type arr2: List[int]
        :rtype: int
        """
        