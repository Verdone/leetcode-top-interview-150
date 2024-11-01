# 199. Binary Tree Right Side View
# Difficulty: Medium
# Category: General Binary BFS

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []

        q = deque([(root, 1)])
        m={1: root.val}
        while q:
            node = q[0][0]
            level = q[0][1]
            if level not in m:
                m[level] = node.val
            q.popleft()
            if node.right:
                q.append((node.right, level + 1))
            if node.left:
                q.append((node.left, level + 1))
            

        return list(m.values())