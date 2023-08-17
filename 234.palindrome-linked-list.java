/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */

// @lc code=start
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
    public boolean isPalindrome(ListNode head) {
        ListNode faster = head;
        ListNode slow = head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        while(faster !=null && faster.next !=null){
            pre = pre.next;
            faster = faster.next.next;
            slow = slow.next;
        }
        pre.next = null;
        pre = null;

        ListNode cur = slow;
        ListNode next = null;
        while(cur !=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        while(pre!= null && head!=null){
            if(pre.val != head.val){
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;
    }
}
// @lc code=end

