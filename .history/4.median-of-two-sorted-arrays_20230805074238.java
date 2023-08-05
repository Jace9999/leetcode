/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int m = nums2.length;
    int left = (n + m + 1) / 2;
    int right = (n + m + 2) / 2;
    //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
    return (findK(nums1, 0, n - 1, nums2, 0, m - 1, left) + findK(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;

    }

    public int findK(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k){
        int len1 = end1 - start1 +1;
        int len2 = end2 - start2 +1;
        if(len1 > len2){
            return findK(nums2, start2, end2, nums1, start1, end1, k);
        }
        if(len1 == 0){
            return nums2[start2 + k -1];
        }
        if(k == 1){
            return Math.min(nums1[start1], nums2[start2]);
        }

        int i = start1 + Math.min(len1, k/2)-1;
        int j = start2 + Math.min(len2, k/2)-1;

        if(nums1[i] > nums2[j]){
            return findK(nums1, start1, end1, nums2, j+1, end2, k - (j-start2 + 1));
        }else{
            return findK(nums1, i+1, end1, nums2, j+1, end2, k - (i-start1 + 1));
        }
    }
}
// @lc code=end

