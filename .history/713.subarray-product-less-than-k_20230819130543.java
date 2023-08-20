/*
 * @lc app=leetcode id=713 lang=java
 *
 * [713] Subarray Product Less Than K
 */

// @lc code=start
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
                int left =0;
        int sum =1;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            sum *= nums[i];
            while(left < i && sum >= k){
                sum /= nums[left++];
            }
            if(sum < k){
                res += i - left + 1;
            }
        }
        return res;
    }
}
// @lc code=end

