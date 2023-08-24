/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m){
            return false;
        }
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for(int i=0;i<n;i++){
            c1[s1.charAt(i) - 'a']++;
            c2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(c1, c2)){
            return true;
        }
        for(int j=n;j<m;j++){
            c2[s2.charAt(j)-'a']++;
            c2[s2.charAt(j-n)-'a']--;
            if(Arrays.equals(c1, c2)){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

