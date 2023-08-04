/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left =0;
        int x = matrix.length;
        int y = matrix[0].length;
        int right = x * y - 1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(matrix[mid/y][mid%y] == target){
                return true;
            }else if(matrix[mid/y][mid%y] > target){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return false;
    }
}
// @lc code=end

