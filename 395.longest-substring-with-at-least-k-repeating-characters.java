/*
 * @lc app=leetcode id=395 lang=java
 *
 * [395] Longest Substring with At Least K Repeating Characters
 */

// @lc code=start

import java.util.Map;

class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k){
            return 0;
        }
        Map<Character,Integer> map =  new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1 );
        }
        for(Character c : map.keySet()){
            if(map.get(c) < k){
                int res = 0;
                for(String sub : s.split(String.valueOf(c))){
                    res = Math.max(res, longestSubstring(sub, k));
                }
                return res;
            }
        }
        return s.length();
    }
}
// @lc code=end

