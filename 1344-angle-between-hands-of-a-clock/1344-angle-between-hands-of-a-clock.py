class Solution(object):
    def angleClock(self, hour, minutes):
        minuteAngle = minutes*6
        hourAngle = hour*30 + minutes*0.5
        diff = abs(minuteAngle-hourAngle)
        return min(diff,360-diff)

        """
        :type hour: int
        :type minutes: int
        :rtype: float
        """
        