# 71. Simplify Path
# Difficulty: Medium
# Category: Stack

class Solution:
    def simplifyPath(self, path: str) -> str:
        path = path.split("/")
        output = []

        for i in range(len(path)):
            if path[i] == "" or path[i] == ".":
                continue
            elif path[i] == "..":
                if output:
                    output.pop(-1)
            else:
                output.append(path[i])
        
        path = "/".join(output)

        return "/"+path