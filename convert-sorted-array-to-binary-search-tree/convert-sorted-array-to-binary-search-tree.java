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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode node = R(nums, 0, nums.length -1);
        return node;
    }
    
    public TreeNode R(int[] nums, int si, int ei) {
        if(si > ei){
            return null;
        }
        int middle = (si+ei +1)/2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = R(nums, si, middle -1);
        node.right = R(nums, middle +1, ei);
        return node;
        
    }
}