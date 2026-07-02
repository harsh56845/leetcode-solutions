class Solution(object):
    def defangIPaddr(self, address):
        return '[.]'.join(address.split('.'))
        """
        :type address: str
        :rtype: str
        """
        