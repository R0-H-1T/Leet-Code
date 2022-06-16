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





public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode p = new ListNode(0);
        ListNode head = p;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            if(l1!=null){
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                carry += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(carry%10);
            carry/=10;
            p=p.next;
        }
        return head.next;
        
        
    }

    // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //     if (l1 == null && l2 == null) return null;
    //     int val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
    //     ListNode head = new ListNode(val % 10);
    //     head.next = addTwoNumbers(l1 == null ? null : l1.next, l2 == null ? null : l2.next);
    //     if (val >= 10) head.next = addTwoNumbers(head.next, new ListNode(1));
    //     return head;
    // }
}
