/*
 * @lc app=leetcode id=239 lang=java
 *
 * [239] Sliding Window Maximum
 */

// @lc code=start

import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 1){
            return nums;
        }
        Deque<Integer> index = new ArrayDeque<>();
        int len = nums.length - k + 1;
        int[] res = new int[len];
        int curPosition = 0;
        for(int i=0;i<nums.length;i++){
            while(!index.isEmpty() && index.peekFirst() < i - k + 1){
                index.pollFirst();
            }
            while(!index.isEmpty() && nums[index.peekLast()] <= nums[i] ){
                index.pollLast();
            }
            index.addLast(i);
            if(i >= k -1){
                res[curPosition++] = index.peekFirst();
            }
        }
        return res;
    }
}
// @lc code=end

