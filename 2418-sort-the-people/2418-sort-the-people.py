class Solution:
    def sortPeople(self, names: list[str], heights: list[int]) -> list[str]:
        n = len(names)
        mapping = dict()

        for idx in range(n):
            mapping[heights[idx]] = names[idx]

        heights.sort(reverse=True)

        for idx in range(n):
            names[idx] = mapping[heights[idx]]

        return names