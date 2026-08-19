class Codec:

    def __init__(self):
        self.urlToCode = {}
        self.codeToUrl = {}
        self.counter = 0

    def encode(self, longUrl):
        if longUrl not in self.urlToCode:
            code = str(self.counter)
            self.counter += 1

            self.urlToCode[longUrl] = code
            self.codeToUrl[code] = longUrl

        return "http://tinyurl.com/" + self.urlToCode[longUrl]

    def decode(self, shortUrl):
        code = shortUrl.split("/")[-1]
        return self.codeToUrl[code]
        

# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(url))