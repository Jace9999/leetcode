/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[]{0,0,0};
        for(int num: nums){
            arr[num]++;
        }
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[index] == 0){
                index++;
            }
            nums[i] = index;
            nums[index]--;
        }
    }
}
// @lc code=end

