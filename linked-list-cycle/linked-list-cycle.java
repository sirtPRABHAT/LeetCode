/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        if(head == null || head.next == null){
            return false;
        }
        ListNode fast = head;
        boolean res = false;
        while(fast.next !=null && fast.next.next !=null){
             slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                res = true;
                break;
            }
           
           // fast = fast.next !=null ? fast.next.next: null;
            
            
        }
        
        return res;
    }
}