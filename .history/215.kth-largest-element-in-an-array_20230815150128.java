/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int rank = quickFind(nums, i);
            if(rank==nums.length - k){
                return nums[i];
            }
        }
        return - 1;
    }

    public int quickFind(int[] nums, int i){
        int num = nums[i];
        int left = 0;
        int right = nums.length -1;
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
        return left;
    }
}
// @lc code=end

