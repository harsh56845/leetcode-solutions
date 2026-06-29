class Solution(object):
    def largestAltitude(self, gain):
        highest = 0
        gain_sum = 0
        for g in gain:
            gain_sum+=g
            highest = max(gain_sum,highest)

        return highest
        """
        :type gain: List[int]
        :rtype: int
        """
        