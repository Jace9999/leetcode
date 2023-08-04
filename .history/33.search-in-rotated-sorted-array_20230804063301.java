/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        // Solution 1:
        // int left = 0;
        // int right = nums.length -1;
        // while(left < right){
        //     int mid = left + (right - left) /2;
        //     if(nums[mid] < nums[right]){
        //         right = mid;
        //     }else{
        //         left = mid + 1;
        //     }
        // }
        // int rotate = left;
        // left = 0;
        // right = nums.length -1;
        // while(left <= right){
        //     int mid = left + (right - left) /2;
        //     int realMid = (rotate + mid) % nums.length;
        //     if(nums[realMid] == target){
        //         return realMid;
        //     }else if(nums[realMid] > target){
        //         right = mid - 1;
        //     }else{
        //         left = mid + 1;
        //     }
        // }
        // return -1;

        // Solution 2:
                int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int pivot = left;

        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int realMid = (mid + pivot) % nums.length; // Adjusting mid to the actual rotated index.

            if (nums[realMid] == target) {
                return realMid;
            } else if (nums[realMid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
// @lc code=end

