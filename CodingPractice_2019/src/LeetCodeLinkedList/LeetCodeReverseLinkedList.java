/*
Reverse Linked List
https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/

Reverse a singly linked list.
Example:
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:
A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

package LeetCodeLinkedList;

import java.util.List;

public class LeetCodeReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverseListIterate(head);
    }

    public ListNode reverseListIterate(ListNode head) {
        ListNode prev = null;
        ListNode curNode = head;
        ListNode next = null;


        while (curNode != null){
            next = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = next;
        }
        head = prev;
        return head;
    }

    // Learn from solution.
    public ListNode reverseListRecursive(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
