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

    

    

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode handler = null;
        if(l1.val<l2.val){
            handler = l1;
            handler.next = mergeTwoLists(l1.next, l2);
        }else{
            handler  = l2;
            handler.next = mergeTwoLists(l1, l2.next);
        }
        return handler;
    }


     
}
