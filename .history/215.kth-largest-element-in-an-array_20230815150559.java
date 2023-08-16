/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        while(true){
            int rank = quickFind(nums, left, right);
            if(rank == nums.length - k ){
                return nums[rank];
            }else if(rank > nums.length - k){
                right = rank - 1;
            }else{
                left = rank+ 1;
            }
        }
    }

    public int quickFind(int[] nums, int left, int right){
        int i = left;
        int num = nums[left];
        while(left < right){
            while(left < right && nums[right] >= num){
                right--;
            }
            while(left < right && nums[left] <= num){
                left++;
            }
            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        nums[i] = nums[left];
        nums[left] = num;
        return left;
    }
}
// @lc code=end

