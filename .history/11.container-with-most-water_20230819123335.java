/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left =0; 
        int right = height.length -1;
        while(left < right){
            int curMin = Math.min(height[left], height[right]);
            max = Math.max(max, curMin * (right - left));
            if(curMin == height[left]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
// @lc code=end

