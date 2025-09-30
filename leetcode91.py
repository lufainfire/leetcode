class Solution(object):
    def fib(self, n):
        fibList = [1,2]
        if n <= 0:
            return 1
        if n == 1:
            return 2
        else:
            while len(fibList) <= n:
                fibList.append(fibList[-1]+fibList[-2])
        return fibList[-1]

    def numDecodings(self, s):
        linkCount = 0
        isBroken = False
        numWays = 1
        if int(s[0]) == 0:
            return 0
        for index in range(1, len(s)):
            if isBroken:
                numWays *= self.fib(linkCount)
                isBroken = False
                linkCount = 0
            if int(s[index]) == 0:
                isBroken = True
                if int(s[index - 1]) > 2 or int(s[index - 1]) == 0:
                    return 0
                else:
                    linkCount -= 1
                    if linkCount < 0:
                        linkCount = 0
            elif int(s[index - 1]) == 1 or (int(s[index - 1]) == 2 and int(s[index]) < 7):
                linkCount += 1
            else:
                isBroken = True
        return numWays*self.fib(linkCount)