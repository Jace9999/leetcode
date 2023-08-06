/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length ==1){
            return;
        }
        int i =0;
        int j = 1;
        while(j < nums.length){
            while(i < j && nums[i] != 0){
                i++;
            }
            while(nums[j]==0){
                j++;
            }
            if(j < nums.length){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
    }
}
// @lc code=end

