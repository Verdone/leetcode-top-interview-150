// 92. Reverse Linked List II
// Difficulty: Medium
// Category: Linked List

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        return util1(head,left,right);
    }
    public ListNode util1(ListNode head, int left, int right) {
        ListNode foo = new ListNode(-1, head);
        ListNode revHead = head;
        ListNode revTail = head;
        ListNode t1 = foo;
        ListNode t2 = foo;
        ListNode t3 = foo;
        for (int index = 0; index <= right; index++) {
            if (index == left - 1) {
                t1 = t3;
                revHead = t3.next;
            }
            if (index == right) {
                revTail = t3;
                t2 = revTail.next;
            }
            t3 = t3.next;
        }
        revTail.next = null;
        reverse(revHead);
        t1.next = revTail;
        if (t1 != t2) {
            revHead.next = t2;
        }
        ListNode ans = foo.next;
        foo.next = null;
        return ans;
    }

    public void reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return;
    }
}