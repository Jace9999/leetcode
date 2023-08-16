/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] nums) {
        int leftMax = nums[0];
        int rightMax = nums[nums.length - 1];
        int res = 0;
        int left = 1;
        int right = nums.length - 2;
        while(left <= right){
            if(nums[left] < nums[right]){
                rightMax = Math.max(rightMax, nums[right]);
                res += Math.max(0,rightMax-nums[left] );
                left++;
            }else{
                leftMax = Math.max(leftMax, nums[left]);
                res+= Math.max(0,leftMax-nums[right]);
                right--;
            }
        }
        return res;
    }
}
// @lc code=end

