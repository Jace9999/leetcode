/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> positionMap = new HashMap<>();
            int max =0;
            int start =0;
            for(int i=0;i<s.length();i++){
                if(positionMap.containsKey(s.charAt(i))){
                    start = Math.max(positionMap.get(s.charAt(i)) + 1, start);
                }
                max = Math.max(max, i- start + 1);
                positionMap.put(s.charAt(i), i);
            }
            return max;
    }
}
// @lc code=end

