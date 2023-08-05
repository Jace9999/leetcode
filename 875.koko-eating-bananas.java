/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int min = piles[piles.length -1];
        int left = 1;
        int right = min;
        while(left < right){
            int mid = left + (right - left) /2;
            if(eatable(piles,h,mid)){
                min = Math.min(mid, min);
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

