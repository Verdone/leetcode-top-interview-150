// 105. Construct Binary Tree from Preorder and Inorder Traversal
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
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
         HashMap<Integer,Integer> m=new HashMap<>();
 
         for(int i=0;i< inorder.length;i++){
             m.put(inorder[i],i);
         }
 
         int [] i={0};
 
         return helper(preorder,inorder,0,preorder.length-1,m,i);
     }
 
     private static TreeNode helper(int[] preorder, int[] inorder, int left, int right, HashMap<Integer, Integer> m,int [] i) {
         if(left>right){
             return null;
         }
 
         int curr=preorder[i[0]];
         i[0]++;
 
         TreeNode node=new TreeNode(curr);
 
         if(left==right){
             return node;
         }
 
         int inorderIndex=m.get(curr);
         node.left=helper(preorder,inorder,left,inorderIndex-1,m,i);
         node.right=helper(preorder,inorder,inorderIndex+1,right,m,i   );
 
         return node;
     }
 }