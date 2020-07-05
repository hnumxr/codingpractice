/*
Merge Two Sorted Lists
Merge two sorted linked lists and return it as a new sorted list. The new list
should be made by splicing together the nodes of the first two lists.

Example:
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */
package LeetCodeLinkedList;

public class LeetCodeMergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dummy1 = new ListNode(0, l1);
        ListNode dummy2 = new ListNode(0, l2);
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                if(l1.next == null){
                    l1.next = l2;
                    break;
                }
                if(l2.val <= l1.next.val) {
                    dummy2.next = l2.next;
                    l2.next = l1.next;
                    l1.next = l2;
                    l2 = dummy2.next;
                    continue;
                }
                else if(l2.val > l1.next.val){
                    l1 = l1.next;
                    continue;
                }
            }
            else if(l1.val == l2.val){
                dummy2.next = l2.next;
                l2.next = l1.next;
                l1.next = l2;
                l2 = dummy2.next;
                continue;
            }
            else if(l1.val > l2.val){
                dummy2.next = l2.next;
                l2.next = l1;
                dummy1.next = l2;
                l2 = dummy2.next;
                l1 = dummy1.next;
                continue;
            }
        }
        return dummy1.next;
    }
}
