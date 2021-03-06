/*
Remove Nth Node From End of List
https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/

Given a linked list, remove the n-th node from the end of list and return its head.

Example:
Given linked list: 1->2->3->4->5, and n = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.

Follow up:
Could you do this in one pass?

Hint #1
Maintain two pointers and update one with a delay of n steps.
 */

package LeetCodeLinkedList;

public class LeetCodeRemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode c = dummy;
        int len = listLength(dummy.next);

        for (int i = 0; i< len - n; i++){
            c = c.next;
        }
        c.next = c.next.next;

        return dummy.next;
    }

    public ListNode removeNthFromEndAdvance(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        for(int i = 0; i < n; i++){
            first = first.next;
        }

        while (first.next != null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;
    }

    private int listLength(ListNode head){
        int c = 1;
        while (head.next != null){
            head = head.next;
            c++;
        }
        return c;
    }
}
