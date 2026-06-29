class Solution(object):
    def asteroidsDestroyed(self, mass, asteroids):
        asteroids.sort()
        currentmass = mass
        for aster in asteroids:
            if aster <= currentmass:
                currentmass += aster
            else :
                return False
        return True
        """
        :type mass: int
        :type asteroids: List[int]
        :rtype: bool
        """
        