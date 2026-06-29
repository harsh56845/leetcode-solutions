class Solution(object):
    def decodeCiphertext(self, s, rows):
        if not s:
            return s

        cols = int(math.ceil(len(s)/rows))
        res = []

        for start in range(cols):
            r,c = 0,start
            while r<rows and c<cols:
                res.append(s[r*cols+c])
                r+=1
                c+=1
        return ''.join(res).rstrip()

        """
        :type encodedText: str
        :type rows: int
        :rtype: str
        """
        