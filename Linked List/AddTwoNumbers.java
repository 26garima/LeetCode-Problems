// Problem Link : https://leetcode.com/problems/add-two-numbers/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        int carry = 0;
        
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                ListNode currSumNode = new ListNode((l2.val+carry)%10);
                carry = (l2.val+carry)/10;
                temp.next = currSumNode;
                temp = temp.next;
                l2 = l2.next;
            } else if(l2 == null) {
                ListNode currSumNode = new ListNode((l1.val+carry)%10);
                carry = (l1.val+carry)/10;
                temp.next = currSumNode;
                temp = temp.next;
                l1 = l1.next;
            } else {
                ListNode currSumNode = new ListNode((l1.val+l2.val+carry)%10);
                carry = (l1.val+l2.val+carry)/10;
                temp.next = currSumNode;
                temp = temp.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        
        if(carry == 1) {
            temp.next = new ListNode(1);
        }
        
        return result.next;
    }
}

/*
Time Complexity = O(max(M,N)), where "M","N" are the length the two input lists, l1 and l2.
Sapce Complexity = O(max(M,N)+1), where "M","N" are the length the two input lists, l1 and l2.
*/
