/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 */

// @lc code=start

import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        int left =0;
        int minIndex = 0;
        int minLength = s.length() + 1;
        Map<Character, Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }
        for(int right =0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)-1);
                if(map.get(s.charAt(right))>=0){
                    count++;
                }
            }
            while(count == t.length()){
                if(minLength > right - left + 1){
                    minLength = right - left + 1;
                    minIndex = left;
                }
                if(map.containsKey(left)){
                    map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0)+1);
                    if(map.get(s.charAt(left))>0){
                        count--;
                    }
                }
                left++;
            }
        }
        if(minLength>s.length()){
            return "";
        }
        return s.substring(minIndex, minIndex + minLength);
    }
}
// @lc code=end

