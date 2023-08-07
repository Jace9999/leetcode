/*
 * @lc app=leetcode id=845 lang=java
 *
 * [845] Longest Mountain in Array
 */

// @lc code=start
class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length < 3){
            return 0;
        }
        int up = 0;
        int down = 0;
        int res = 0;
        for(int i=1;i<arr.length;i++){
            if(down > 0 && arr[i] >= arr[i-1] || (arr[i] == arr[i-1])){
                up = 0;
                down = 0;
            }
            if(up > 0 && arr[i] < arr[i-1]){
                down++;
            }
            if(arr[i] > arr[i-1]){
                up++;
            }
            if( down > 0 && up+down + 1 > res ){
                res = up + down + 1;
            }
        }
        return res;
    }
}
// @lc code=end

