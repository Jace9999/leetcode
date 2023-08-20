/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        char[] ch = s.toCharArray();
        while(left < right){
            if(isPalindrome(ch,left,right)){
                left++;
                right--;
            }else{
                return  isPalindrome(ch,left+1,right) || isPalindrome(ch,left,right-1);
            }
        }
        return true;
    }

    public boolean isPalindrome(char[] ch, int left, int right){
        while(left < right && ch[left] == ch[right]){
            left++;
            right--;
        }
        return left == right ? true : false;
    }
}
// @lc code=end

