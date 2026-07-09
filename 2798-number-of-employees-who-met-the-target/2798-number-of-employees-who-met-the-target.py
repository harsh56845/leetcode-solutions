class Solution(object):
    def numberOfEmployeesWhoMetTarget(self, hours, target):
        # return sum(x : for h in hours: if(h>=target): x=1 else: x=0)
        return sum(h>=target for h in hours)
        """
        :type hours: List[int]
        :type target: int
        :rtype: int
        """
        