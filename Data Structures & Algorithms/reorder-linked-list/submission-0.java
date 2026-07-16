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
    public ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        ListNode next = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return next;
    }
    public void reorderList(ListNode head) {
        int count = 0;
        ListNode ref = head;
        ListNode ref_f = head;
        while(ref!=null)
        {
            ref = ref.next;
            count++;
        }
         ref = head;
        int count2=0;
        while(count2<(count+1)/2-1)
        {
            ref = ref.next;
            count2++;
        }
        ListNode ref1 = ref.next;
        ref.next = null;
        ListNode ref2 = reverse(ref1);
        ref=head;
        while(ref!=null && ref2!=null)
        {
            ListNode nextref = ref.next;
            ListNode nextref2= ref2.next;
            ref.next = ref2;
            ref2.next = nextref;
            ref = nextref;
            ref2 = nextref2;
        }

    }
}
