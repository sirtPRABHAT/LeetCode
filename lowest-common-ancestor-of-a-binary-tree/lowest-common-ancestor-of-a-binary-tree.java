/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<TreeNode> one = new ArrayList<>();
    List<TreeNode> two = new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    traverse(root, p, one);
    traverse(root,q, two);
        
        // for(TreeNode a : one){
        //     System.out.println(a.val);
        // }
     
        
        //FOUND LAST COMMAN NODE
        //SO TRAVERSE TILL DIFFERENT NODE FOUND, AND RETURN LAST NODE 
        int i=0;
        for (i = 0; i < one.size() && i < two.size(); i++) {
            if (!one.get(i).equals(two.get(i))){
                break;
            }
        }
 
         return one.get(i-1);
     }
    
    //CODE TO FIND PATH FROM ROOT TO GIVEN NODE IN BINARY TREE
    public boolean traverse(TreeNode root, TreeNode key, List<TreeNode> list){
        if(root == null){
            return false;
        }
        list.add(root);
        if(root.val == key.val){
            return true;
        }
        
        if( traverse(root.left, key, list)) return true;
        if(traverse(root.right, key, list)) return true;
     
        list.remove(list.size() -1);
        return false;
        
    }
}