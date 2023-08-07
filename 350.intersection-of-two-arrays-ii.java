/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i:nums1){
        //     map.put(i, map.getOrDefault(i, 0)+1);
        // }
        // List<Integer> list = new ArrayList<>();
        // for(int i:nums2){
        //     if(map.containsKey(i) && map.get(i) >0){
        //         list.add(i);
        //         map.put(i, map.get(i)-1);
        //     }
        // }
        // int[] res = new int[list.size()];
        // int size = 0;
        // for(int i: list){
        //     res[size++] = i;
        // }
        // return res;

        //Better Solution:
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int index = 0;
        for(int i:nums2){
            if(map.containsKey(i) && map.get(i) >0){
               nums1[index++] = i;
                map.put(i, map.get(i)-1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, index);
    }
}
// @lc code=end

