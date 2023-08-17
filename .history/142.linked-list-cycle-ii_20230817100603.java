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
                break;
            }
        }
        if(faster == null || faster.next == null){
            return null;
        }
        while(head != faster){
            head = head.next;
            faster = faster.next;
        }
        return head;
    }
}
// @lc code=end

