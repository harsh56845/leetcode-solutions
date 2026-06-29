class Solution(object):
    def numSpecial(self, mat):
        cnt = 0
        m = len(mat)
        n = len(mat[0])
        row = [0]*m
        col = [0]*n
        for i in range(m):
            for j in range(n):
                if(mat[i][j]==1):
                    row[i]+=1
                    col[j]+=1

        for i in range(m):
            for j in range(n):
                if(mat[i][j]==1 and row[i]==1 and col[j]==1):
                    cnt+=1
        
        return cnt

        """
        :type mat: List[List[int]]
        :rtype: int
        """
        