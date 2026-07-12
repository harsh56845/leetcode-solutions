class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        arr2 = arr.copy()
        arr2.sort()
        ranks = dict()
        rank=1
        for a in arr2:
            if a not in ranks:
                ranks[a]=rank
                rank+=1

        for i in range(len(arr)):
            arr[i] = ranks[arr[i]]

        return arr
            
