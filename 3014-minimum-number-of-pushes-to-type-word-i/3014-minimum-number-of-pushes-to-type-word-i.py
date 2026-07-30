class Solution(object):
    def minimumPushes(self, word):
        n = len(word)
        b = n/8
        # rem = nw%8

        return (b*(b+1)*4)+(n%8)*(b+1)