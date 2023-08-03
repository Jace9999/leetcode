/*
 * @lc app=leetcode id=658 lang=java
 *
 * [658] Find K Closest Elements
 */

// @lc code=start
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length -1;

        while(left < right){
            int mid = left + (right - left) /2 ;
            if(arr[mid] == x){
                break;
            }else if(arr[mid] > x){
                right = mid;
            }
        }
    }
}
// @lc code=end

