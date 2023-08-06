/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // if(nums.length ==1){
        //     return;
        // }
        // int i =0;
        // int j = 1;
        // while(j < nums.length){
        //     while(i < j && nums[i] != 0){
        //         i++;
        //     }
        //     while(j < nums.length && nums[j]==0){
        //         j++;
        //     }
        //     if(j < nums.length){
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         j++;
        //     }
        // }
        int zero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[zero++] = nums[i];
            }
        }

        for(int i=zero;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}
// @lc code=end

