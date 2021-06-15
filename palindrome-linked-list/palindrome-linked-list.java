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
class Solution {
   public boolean res = true;
    public boolean isPalindrome(ListNode head) {
        head = foo(head, head);
        return res;
    }
    
    public ListNode foo(ListNode head, ListNode current){
        if(current == null){
            return head;
        }
        
        head = foo(head, current.next);
        if(head.val != current.val){
            res = false;
        }
       return head = head.next;
        
    }
}