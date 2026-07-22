class Solution(object):
    def decodeMessage(self, key, message):
        char = ord('a')
        mapped = {' ':' '}
        # mapped[' ']=' '
        for k in key:
            if k!=' ' and k not in mapped:
                mapped[k] = chr(char)
                char+=1
        sol=[]
        for msg in message:
            sol.append(mapped[msg])
        
        return "".join(sol)
        