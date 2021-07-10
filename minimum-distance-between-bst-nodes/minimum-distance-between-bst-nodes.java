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
    int sum = Integer.MAX_VALUE;
    TreeNode pre = null;
    public int minDiffInBST(TreeNode root) {
        t(root);
        return sum;
    }
    
    public void t(TreeNode root) {
        if(root == null){
            return;
        }
        t(root.left);
        System.out.println(root.val);
        if(pre == null){
            pre = root;
        }else{
            if(Math.abs(pre.val-root.val) <= sum){
                sum = Math.abs(pre.val-root.val);
            }
        }
        pre = root;
         t(root.right);
    }
}