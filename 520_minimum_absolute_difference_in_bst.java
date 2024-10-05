// 530. Minimum Absolute Difference in BST
// Difficulty: Easy
// Category: Binary Search Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int p = -100000, m = 100000;
  
    public int getMinimumDifference(TreeNode node) {
      if (node == null) return m;
  
      getMinimumDifference(node.left);
      m = Math.min(m, node.val - p);
      p = node.val;
      getMinimumDifference(node.right);
  
      return m;
    }
  }