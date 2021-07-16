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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempL =  new  ArrayList<Integer>();
        if(root == null) return list;
        q.add(root);
        while(!q.isEmpty()){
             List<Integer> t =  new  ArrayList<Integer>();
            int size = q.size();
            for(int i =0; i < size; i++){
                t.add(q.peek().val);
                TreeNode temp = q.poll();
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
            }
             list.add(t);
         
        }
        Collections.reverse(list);
        return list;
    }
}


//FOR REVERSING TRY BETTER SOLUTION;