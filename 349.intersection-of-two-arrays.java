/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start

import java.util.Map;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> map = new HashSet<>();
        for(int i:nums1){
            map.add(i);
        }
        for(int i:nums2){
            if(map.contains(i)){
                set.add(i);
            }
        }
        int[] res =  new int[set.size()];
        int index = 0;
        for(int i: set){
            res[index++] = i;
        }
        return res;
    }
}
// @lc code=end

