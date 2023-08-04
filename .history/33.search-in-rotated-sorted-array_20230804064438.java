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
        int right = nums.length -1;
        while(left < right){
            int mid = left + (right - left) /2;
            if(nums[mid] < nums[right]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        int pivot = left;
        if(target < nums[pivot] || (pivot>0 && nums[pivot-1] < target)){
            return -1;
        }
        left = 0;
        right = nums.length -1;
        if(nums[pivot] <= target && nums[right]>=target){
            left = pivot;
            while(left <= right){
            int mid = left + (right - left) /2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;

            }else{
                right = mid;
                }
            }
        }else{
            right = pivot-1;
            while(left <= right){
            int mid = left + (right - left) /2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid;

            }
        }
    }
    return -1;
    }
}
// @lc code=end

