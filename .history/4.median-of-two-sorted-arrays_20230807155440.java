/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        return (findK(nums1,0,len1-1,nums2, 0 , len2-1,(len1+len2 + 1)/2) + 
        findK(nums1,0,len1-1,nums2, 0 , len2-1,(len1+len2 + 2)/2))*0.5;
    }

    public int findK(int[] nums1, int start1, int end1, int[] nums2,
    int start2, int end2, int k){
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        if(len1 > len2){
            return findK(nums2, start2, end2, nums1, start1, end1, k);
        }
        if(start1 > end1){
            return nums2[start2 + k -1];    
        }
        if(k == 1){
            return Math.min(nums1[start1], nums2[start2]);
        }

        int i = start1 + Math.min(end1 - start1 + 1, k/2) - 1;
        int j = start2 + Math.min(end2 - start2 + 1, k/2) - 1;
        if(nums1[i] > nums2[j]){
            return findK(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
        }else{
            return findK(nums1, i+1, end1, nums2, start2, end2, k - (i - start1 + 1));
        }
    }
}
// @lc code=end

