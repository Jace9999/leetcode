/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(0);
        ListNode e = even;
        ListNode odd = new ListNode(0);
        ListNode o = odd;
        int index = 1;
        while(head != null){
            if(index % 2 != 0){
                e.next = head;
                e = e.next;
            }else{
                o.next = head;
                o = o.next;
            }
            head = head.next;
            index++;
        }
        e.next = odd.next;
        o.next = null;
        return even.next;
    }
}
// @lc code=end

