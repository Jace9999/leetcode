/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int index = nums1.length-1;
        while(m >= 0 && n >=0){
            if(nums1[m] > nums2[n]){
                nums1[index] = nums1[m];
                m--;
            }else{
                nums1[index] = nums2[n];
                n--;
            }
            index--;
        }
        if(n <0){
            for(int i=m;i <=0;i--){
                nums1[index--] = nums1[i];
            }
        }
        if(m <0){
            for(int i=n;i <=0;i--){
                nums1[index--] = nums2[i];
            }
        }
    }
}
// @lc code=end

