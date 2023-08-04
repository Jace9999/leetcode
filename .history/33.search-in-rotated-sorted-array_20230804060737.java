/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            int mid = left + (right - left) /2;
            if(nums[mid] < nums[right]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        int rotate = left;
        left = 0;
        right = nums.length -1;
        while(left < right){
            int mid = left + (right - left) /2;
            int realMid = (rotate + mid) % nums.length;
            if(nums[realMid] == target){
                return realMid;
            }else if(nums[realMid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return nums[(rotate + left) % nums.length] == target ? (rotate + left) % nums.length : -1;
    }
}
// @lc code=end

