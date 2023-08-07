/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int zero = -1;
        int one = 0;
        int two = nums.length -1;
        while(one <= two){
            if(nums[one] == 0){
                zero++;
                swap(nums, zero, one);
                one++;
            }else if(nums[one] == 1){
                one++;
            }else{
                swap(nums, one, two);
                two--;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// @lc code=end

