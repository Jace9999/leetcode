/*
 * @lc app=leetcode id=1283 lang=java
 *
 * [1283] Find the Smallest Divisor Given a Threshold
 */

// @lc code=start
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int left =1;
        int right = nums[nums.length-1];
        while(left < right){
            int mid = left + (right - left) /2;
            if(isAvailable(nums, mid)){
                right = mid;
            }else{
                left = mid +1;
            }
        }
        return left;
    }

    public boolean isAvailable(int[] nums, int k, int threshold){
        int spend = 0;
        for(int num: nums){
            spend += num % k == 0 ? num/k : num/k + 1;
        }
        return spend <= threshold;
    }
}
// @lc code=end

