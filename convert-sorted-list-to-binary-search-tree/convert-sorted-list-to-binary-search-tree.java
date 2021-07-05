/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    static ListNode head;
    public TreeNode sortedListToBST(ListNode head) {
     int n = countNodes(head);
        this.head = head;
 
        /* Construct BST */
        return sortedListToBSTRecur(n);
    }
    
TreeNode sortedListToBSTRecur(int n)
    {
    
        if (n <= 0)
            return null;
 
      
        TreeNode left = sortedListToBSTRecur(n / 2);
 
      
         
        TreeNode root = new TreeNode(this.head.val);
 
    
        root.left = left;
 
        head = head.next;
 
        root.right = sortedListToBSTRecur(n - n / 2 - 1);
 
        return root;
    }
    
    
        int countNodes(ListNode head)
    {
        int count = 0;
        ListNode temp = head;
        while (temp != null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }
 
}