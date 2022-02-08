// Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-list/

/*
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        while(head != null && head.next != null) {
            if(head.val == head.next.val)
                head = head.next;
            else 
                break;
        }
        
        ListNode p = head;
        
        while(p != null && p.next != null) {
            if(p.val == p.next.val)
                p.next = p.next.next;
            else
                p = p.next;
        }
        
        return head;
    }
}

/*
Time Complexity : O(N), where "N" is the number of nodes in input list.
Space Complexity : O(1)
*/
