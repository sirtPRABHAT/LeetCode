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
    public ListNode middleNode(ListNode head) {
        int count =0;
        ListNode mid = head;
        ListNode voyager = head;
        while(voyager!= null){
            if(count %2 !=0){
                mid = mid.next;
            }
            voyager = voyager.next;
            count++;
        }
        return mid;
    }
}