/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int leftMax =0;
        int rightMax = 0;
        int res = 0;
        while(left <= right){
            if(leftMax > rightMax){
                res += Math.max(0, rightMax-nums[right]);
                rightMax = Math.max(rightMax, nums[right]);
                right--;
            }else{
                res += Math.max(0, leftMax-nums[left]);
                leftMax = Math.max(leftMax, nums[left]);
                left--;
            }
        }
        return res;
    }
}
// @lc code=end

