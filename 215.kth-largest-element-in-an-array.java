/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int target = len-k;
        int left =0;
        int right = len-1;
        while(true){
            int positionIndex = partition(nums, left, right);
            if(positionIndex == target){
                return nums[positionIndex];
            }else if(positionIndex < target){
                left = positionIndex + 1;
            }else{
                right = positionIndex - 1;
            }
        }
    }

    public int partition(int[] nums, int left, int right){
        int i = left;
        int pivot = nums[left];
        while(left < right){
            while(left < right && nums[right] >= pivot){
                right--;
            }
            while(left < right && nums[left] <= pivot){
                left++;
            }
            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        nums[i] = nums[left];
        nums[left] = pivot;
        return left;
    }
}
// @lc code=end

