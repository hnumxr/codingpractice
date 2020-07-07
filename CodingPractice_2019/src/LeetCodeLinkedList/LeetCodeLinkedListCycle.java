/*
Linked List Cycle
https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/773/

Given a linked list, determine if it has a cycle in it.
To represent a cycle in the given linked list, we use an integer pos which
represents the position (0-indexed) in the linked list where tail connects to.
If pos is -1, then there is no cycle in the linked list.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.


Example 2:
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.


Example 3:
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

Follow up:
Can you solve it using O(1) (i.e. constant) memory?

 */
package LeetCodeLinkedList;

public class LeetCodeLinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode fastRunner = head.next;
        ListNode slowRunner = head;
        while (fastRunner != slowRunner){
            if(fastRunner == null || fastRunner.next == null){
                return false;
            }
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }
        return true;
    }
}
