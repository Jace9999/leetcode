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
        while(left < right){
            if(Character.isAlphabetic(ch[left])){
                if(ch[left]>=65 || ch[left]<=90){
                    ch[left] |= 32;
                }
            }
            if(Character.isAlphabetic(ch[right])){
                if(ch[right]>=65 || ch[right]<=90){
                    ch[right] |= 32;
                }
            }
            if(left < right&& !Character.isAlphabetic(ch[left])){
                left++;
            }
            if(left < right&&!Character.isAlphabetic(ch[right])){
                right--;
            }
            if(left < right&&ch[left] != ch[right]){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
// @lc code=end

