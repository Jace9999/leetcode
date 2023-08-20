/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        char[] ch = s.toCharArray();
        while (left < right) {
        while (left < right && !Character.isLetterOrDigit(ch[left])) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(ch[right])) {
            right--;
        }
        
        if (Character.toLowerCase(ch[left]) != Character.toLowerCase(ch[right])) {
            return false;
        }
        
        left++;
        right--;
    }
        return true;
    }
}
// @lc code=end

