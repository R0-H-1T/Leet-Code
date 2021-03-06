
 /* Definition for singly-linked list.*/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 


public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode head = p; 
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                p.next = l1;
                l1 = l1.next;
            }else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if(l1!=null) p.next = l1;
        else if(l2!=null) p.next = l2;
        
        return head.next;
    }

    

    

    public ListNode mergeTwoListsRecur(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode handler = null;
        if(l1.val<l2.val){
            handler = l1;
            handler.next = mergeTwoListsRecur(l1.next, l2);
        }else{
            handler  = l2;
            handler.next = mergeTwoListsRecur(l1, l2.next);
        }
        return handler;
    }


     
}
