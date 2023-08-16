/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return (findK(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, (nums1.length+nums2.length+1)/2) 
        +findK(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, (nums1.length+nums2.length+2)/2)) * 0.5; 
    }

    public int findK(int[] nums1, int s1, int e1, int[] nums2, int s2, int e2, int k){
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1<len2){
            return findK(nums2, s2, e2, nums1, s1, e1, k);
        }
        if(e2-s2 <=0){
            return nums1[s1+k];
        }
        if(k == 1){
            return Math.min(nums1[s1], nums2[s2]);
        }
        int i = s1 + Math.min(k/2, e1-s1);
        int j = s2 + Math.min(k/2, e2-s1);
        if(nums1[i] > nums2[j]){
            return findK(nums1, s1, e1, nums2, i+1, e2, k - (e2-i+1));
        }else{
            return findK(nums1, j+1, e1, nums2, s2, e2, k - (e1-j+1));
        }
    }
}
// @lc code=end

