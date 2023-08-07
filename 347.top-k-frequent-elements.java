/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] list = new ArrayList[nums.length + 1];
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Integer key: map.keySet()){
            if(list[map.get(key)] == null){
                list[map.get(key)] = new ArrayList<>();
            }
            list[map.get(key)].add(key);
        }
        int index = 0;
        for(int i=list.length-1, j = k;i>0 && j >0;i--){
            if(list[i]!=null){
                for(int key : list[i]){
                    res[index++] = key;
                    j--;
                }
            }
        }
        return res;

    }
}
// @lc code=end

