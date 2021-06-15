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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode previous = head;
        
        HashSet<Integer> set = new HashSet<>();
        while(current != null){
            if(!set.add(current.val)){
                previous.next = current.next;
            } else{
                previous = current;
            }
            
            current = current.next;
        }
        return head;
    }
}