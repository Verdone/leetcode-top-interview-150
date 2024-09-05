# 226. Invert Binary Tree
# Category: Binary Tree General
# Difficulty: Easy

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:

        if not root:
            return None

        t = root.left
        root.left = root.right
        root.right = t

        self.invertTree(root.left)
        self.invertTree(root.right)

        return root