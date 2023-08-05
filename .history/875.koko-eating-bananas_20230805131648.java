/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int length = piles.length-1;
        int largest = piles[length];
        int min = largest;
        int left = 0;
        int right = length;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(eatable(piles,h,piles[mid])){
                min = Math.min(piles[mid], min);
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return min;
    }

    public boolean eatable(int[]piles, int h, int k){
        int spend = 0;
        for(int pile: piles){
            spend += pile % k == 0 ? pile/k : pile/k + 1;
        }
        return spend <= h;
    }
}
// @lc code=end
