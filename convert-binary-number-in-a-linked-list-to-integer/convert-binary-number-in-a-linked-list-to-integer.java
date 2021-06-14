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
    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        List<Integer> list = new ArrayList<>();
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        
        int res = 0;
        int i =1;
        for(var a: list){
            res += a* Math.pow(2, (list.size() -i));
            i++;
        }
        return res;
    }
}