/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length -1;
        m--;
        n--;
        while(m >=0 && n >=0){
            if(nums1[m]>nums2[n]){
                nums1[index] = nums1[m];
                index--;
                m--;
            }else{
                nums1[index] = nums2[n];
                index--;
                n--;
            }
        }

        while(m>=0){
            nums1[index] = nums1[m];
            index--;
            m--;
        }

        while(n>=0){
            nums1[index] = nums2[n];
            index--;
            n--;
        }
    }
}
// @lc code=end

