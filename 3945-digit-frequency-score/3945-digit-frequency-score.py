class Solution(object):
    def digitFrequencyScore(self, n):

        # frq = Counter(str(n))

        # ans = 0
        # for k in frq.keys():
        #     ans += int(k) * frq.get(k)
        # return ans

        # return sum(int(num) for num in str(n))

        return sum(map(int, str(n)))
        """
        :type n: int
        :rtype: int
        """
        