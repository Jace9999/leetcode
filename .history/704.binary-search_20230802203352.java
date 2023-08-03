/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = (left + right) /2;
        while(nums[mid]!=target){
            if(left > right){
                return -1;
            }
            if(nums[mid]>target){
                right = mid -1;
            }
            if(nums[mid]<target){
                left = mid +1;
            }
        }

        return mid;
    }
}
// @lc code=end

