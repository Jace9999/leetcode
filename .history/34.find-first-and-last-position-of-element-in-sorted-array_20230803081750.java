/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left) /2 ;
            if(nums[mid]==target){
                int l = mid;
                int r = mid;
                while(l >= 0 && nums[l] == target){
                    l--;
                }
                while(r < nums.length && nums[r] == target){
                    r++;
                }
                return new int[]{l+1,r-1};
            }else if(nums[mid] > target){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }

        return new int[]{-1,-1};
    }
}
// @lc code=end

