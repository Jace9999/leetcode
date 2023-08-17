/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
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
    public boolean hasCycle(ListNode head) {
        if(head == head.next){
            return false;
        }
        ListNode faster = head.next;
        ListNode slower = head;
        while(faster!=null && faster.next!=null){
            if(faster==slower){
                return true;
            }
            faster = faster.next.next;
            slower = slower.next;
        }
        return false;
    }
}
// @lc code=end

