class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        charFrq = Counter(text)
        minAns = 10001

        # print()
        minAns = min(minAns,charFrq.get('b',0))
        minAns = min(minAns,charFrq.get('a',0))
        minAns = min(minAns,charFrq.get('l',0)//2)
        minAns = min(minAns,charFrq.get('o',0)//2)
        minAns = min(minAns,charFrq.get('n',0))

        return minAns
        