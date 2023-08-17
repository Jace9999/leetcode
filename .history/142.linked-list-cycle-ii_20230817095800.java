/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode faster = head;
        ListNode slow = head;
        while(faster!=null && faster.next!=null){
            faster = faster.next.next;
            slow = slow.next;
            if(faster == slow){
                while(slow!= head){
                    slow = slow.next;
                    head = head.next;
                }
                return slow;
            }

        }
        return null;
    }
}
// @lc code=end

