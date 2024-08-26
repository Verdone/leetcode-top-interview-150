# LeetCode Problem #392: Is Subsequence
# Category: Two Pointers

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        
        if len(s) == 0:
            return True
        if len(t) == 0:
            return False

        pS, pT = 0, 0
        while pT <= len(t) - 1:
            if s[pS] == t[pT]:
                pS += 1
            if pS == len(s):
                return True    
            pT += 1
        return False