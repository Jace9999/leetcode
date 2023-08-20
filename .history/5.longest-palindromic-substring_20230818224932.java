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
            getLongestString(s,i,i);
            getLongestString(s,i,i+1);
        }
        return s.substring(maxIndex, maxIndex+maxLength);
    }

    public void getLongestString(String s, int left, int right){
        int start = left;
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        if(maxLength < right - left + 1){
            maxLength = right - left + 1;
            maxIndex = start;
        }
    }
}
// @lc code=end

