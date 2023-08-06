/*
 * @lc app=leetcode id=912 lang=java
 *
 * [912] Sort an Array
 */

// @lc code=start
class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }

    public void quickSort(int[] nums, int left, int right){
        if(left > right){
            return;
        }
        int i=left;
        int j = right;
        int pivot = nums[i];
        while(i < j){
            while(i< j && nums[j]>=pivot){
                j--;
            }
            while(i < j && nums[i]<=pivot){
                i++;
            }
            if(i<j){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        nums[left] = nums[i];
        nums[i] = pivot;
        quickSort(nums, left, i-1);
        quickSort(nums, i+1, right);
    }
}
// @lc code=end

