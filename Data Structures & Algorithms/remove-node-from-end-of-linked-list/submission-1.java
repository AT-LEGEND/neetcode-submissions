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
    private int count = 0;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Base case: we reached the end of the list
        if (head == null) {
            return null;
        }

        // Recursively move to the next node
        head.next = removeNthFromEnd(head.next, n);

        // Post-order processing: increment the counter as recursion unwinds
        count++;

        // If the current node is the N-th node from the end, remove it
        if (count == n) {
            return head.next; // Return the next node, bypassing 'head'
        }

        return head;
    }
}