/*
Palindrome Linked List
https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/772/

Given a singly linked list, determine if it is a palindrome.

Example 1:
Input: 1->2
Output: false
Example 2:
Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?
 */
package LeetCodeLinkedList;

public class LeetCodePalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode reversedLinkedListHead = reverseLinkedList(head);
        while (head!=null){
            if(head.val == reversedLinkedListHead.val){
                head = head.next;
                reversedLinkedListHead = reversedLinkedListHead.next;
            }
            else {
                return false;
            }
        }
        return true;
    }

    private ListNode reverseLinkedList(ListNode head){
        ListNode reversedHead = head;
        while (head!= null){
            ListNode node = new ListNode(head.val);
            node.next = reversedHead;
            reversedHead = node;
            head = head.next;
        }
        return reversedHead;
    }
}
