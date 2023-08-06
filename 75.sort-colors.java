/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        // int[] arr = new int[]{0,0,0};
        // for(int num: nums){
        //     arr[num]++;
        // }
        // int index = 0;
        // for(int i=0;i<nums.length;i++){
        //     while(arr[index] == 0){
        //         index++;
        //     }
        //     nums[i] = index;
        //     arr[index]--;
        // }

        if(nums.length == 1){
            return;
        }
        int two = nums.length-1;
        int zero = -1;
        int one = 0;
        while(one <= two){
            if(nums[one] == 0){
                zero++;
                swap(nums, zero, one);
                one++;
            }else if(nums[one] == 1){
                one++;
            }else{
                swap(nums, two, one);
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

