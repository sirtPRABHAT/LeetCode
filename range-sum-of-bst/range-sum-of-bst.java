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
    public int rangeSumBST(TreeNode root, int low, int high) {
      int r =  preorder(root, 0, low, high);
        return r;
    }
    
    public int preorder(TreeNode root, int r,int low, int high){
        if(root != null){
        if(root.val >= low && root.val <= high){
            r += root.val;
        }
       r = preorder(root.left, r, low, high);   
       r = preorder(root.right, r, low, high);
        }
            return r ;
    }
    
}