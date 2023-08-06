/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        if(nums.length === 1){
            return;
        }
        int[] arr = new int[]{0,0,0};
        for(int num: nums){
            arr[num]++;
        }
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(arr[index] == 0){
                index++;
            }
            nums[i] = index;
            arr[index]--;
        }
    }
}
// @lc code=end

