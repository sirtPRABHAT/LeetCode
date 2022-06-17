

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return  merge(list1, list2);
    }
    
    
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        
        if(list1 ==null){
            ListNode h = list2;
            return h;
        }
        
        if(list2 == null){
           ListNode h = list1;
            return h;
        }
        
        if(list1.val <= list2.val){
            head.next =   merge(list1.next, list2);
            head.val = list1.val;
        }else{
            head.next =   merge(list1, list2.next);
            head.val = list2.val;
        }
           
        return head;
        
    }
    
}