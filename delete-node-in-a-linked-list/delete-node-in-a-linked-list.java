/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;  
    }   
}


//MY DUMB SOLUTION
//     public void deleteNode(ListNode node) {
//         ListNode v = node;
//         while(v !=null){
//             if(v.next.next == null){
//                  v.val = v.next.val;
//                 v.next = null;
               
//                 break;
//             }
//             v.val = v.next.val;
//             v = v.next;
//         }
        
//     }