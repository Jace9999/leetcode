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

        while(true){
            int mid = (left + right) /2;
            if(left > right){
                return -1;
            }
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                right = mid -1;
            }
            if(nums[mid]<target){
                left = mid +1;
            }
        }
    }
}
// @lc code=end

