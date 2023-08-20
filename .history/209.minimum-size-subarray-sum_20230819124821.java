/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = nums.length;
        int i=0;
        int curSum = 0;
        int j =0;
        while(i<nums.length){
            curSum+=nums[i];
            if(curSum>= target){
                while(j<=i && curSum>=target){
                    min = Math.min(min, i-j+1);
                    curSum-=nums[j];
                    j++;
                }
            }
            i++;
        }
        return min;
    }
}
// @lc code=end

