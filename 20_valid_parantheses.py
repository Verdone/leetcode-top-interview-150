# 20. Valid Parantheses
# Category: Stack
# Difficulty: Easy

class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        parentheses = { ")" : "(", "]" : "[", "}" : "{"}

        for i in s:
            if i in parentheses:
                if stack and stack[-1] == parentheses[i]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(i)
        
        return True if not stack else False