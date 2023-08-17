/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int faster = nums[nums[0]];
        int slow = nums[0];
        while(faster != slow){
            faster =nums[nums[faster]];
            slow = nums[slow];
        }
        return faster;
    }
}
// @lc code=end

