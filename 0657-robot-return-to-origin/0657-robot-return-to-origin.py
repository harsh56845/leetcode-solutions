class Solution(object):
    def judgeCircle(self, moves):
        if len(moves)&1: 
            return False
        f = Counter(moves)
        return f['U']==f['D'] and f['L']==f['R']
        """
        :type moves: str
        :rtype: bool
        """
        