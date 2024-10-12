// 106. Construct Binary Tree from Inorder and Postorder Traversal
// Difficulty: Medium
// Category: Binary Tree General

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
    int postPtr=0;
    int inPtr=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postPtr=inorder.length;
        inPtr=inorder.length-1;
        return build(inorder,postorder,Integer.MAX_VALUE);
    }
    public TreeNode build(int[] inOrder,int[] postOrder,int last){
        if(postPtr<0 || inPtr<0){
            return null;
        }
        if(inOrder[inPtr]==last){
            inPtr-=1;
            return null;
        }
        postPtr-=1;
        TreeNode root=new TreeNode(postOrder[postPtr]);
        root.right=build(inOrder,postOrder,root.val);
        root.left=build(inOrder,postOrder,last);
        return root;
    }
}

