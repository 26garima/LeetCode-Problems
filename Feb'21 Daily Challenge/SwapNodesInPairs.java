// Problem Link : https://leetcode.com/problems/swap-nodes-in-pairs/

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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode p = head;
        ListNode q = head.next;
        ListNode r = null;
        
        p.next = q.next;
        q.next = p;
        head = q;
        
        ListNode temp = p;
        p = q;
        q = temp;
        
        r = q;
        p = p.next.next;
        q = q.next;
        if(q != null)
            q = q.next;
        
        while(p != null && q != null) {    
            p.next = q.next;
            q.next = p;
            r.next = q;
            r = r.next.next;
            
            temp = p;
            p = q;
            q = temp;
                
            p = p.next.next;
            q = q.next;
            if(q != null)
                q = q.next;
        }
        
        return head;
    }
}

// Time complexity : O(N), where N is the number of nodes in input list.
// Space Complexity : O(1)
