/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    int maxLength =0;
    int maxIndex =0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            getLongestString(s,i-1,i);
            getLongestString(s,i,i);
        }
        return s.substring(maxIndex, maxIndex+maxLength);
    }

    public void getLongestString(String s, int left, int right){
                if(left > right){
            return;
        }
        int start = left;
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        if(maxLength < right - left - 1){
            maxLength = right - left - 1;
            maxIndex = start - 1;
        }
    }
}
// @lc code=end

