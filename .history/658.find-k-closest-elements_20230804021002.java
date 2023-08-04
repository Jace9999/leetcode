/*
 * @lc app=leetcode id=658 lang=java
 *
 * [658] Find K Closest Elements
 */

// @lc code=start
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - k;
        while(left < right){
            int mid = left + (right - left) /2;
            if(arr[mid+k] - x > x - arr[mid]){
                right--;
            }else{
                left++;
            }
        }
        return Arrays.stream(arr, left, left + k).boxed().collect(Collectors.toList());
    }
}
// @lc code=end

