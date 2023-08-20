/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        int i=0;
        int j=s.length()-1;
        char[] ch = s.toCharArray();
        while(i<j){
            while(i<j&&!set.contains(s.charAt(i))){
                i++;
            }
            while(i<j && !set.contains(s.charAt(j))){
                j--;
            }
            if(i<j&&s.charAt(i)!=s.charAt(j)){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
            i++;
            j--;
        }
        return new String(ch);
    }
}
// @lc code=end

