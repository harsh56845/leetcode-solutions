class Solution(object):
    def convertDateToBinary(self, date):
        year = str(bin(int(date[0:4]))[2::])
        month = str(bin(int(date[5:7]))[2::])
        date = str(bin(int(date[8:]))[2::])

        return year+"-"+month+"-"+date
        
        """
        :type date: str
        :rtype: str
        """
        