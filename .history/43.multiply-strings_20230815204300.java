/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int[] res = new int[len1+len2];
        for(int i = len1-1;i>=0;i--){
            for(int j = len2-1;j>=0;j--){
                int sum = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
                int p1 = i + j;
                int p2 = i + j + 1;
                sum += res[p2];
                res[p1] += sum/10;
                res[p2] = sum % 10;
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i:res){
            if(sb.length() != 0 || i != 0){
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
// @lc code=end

