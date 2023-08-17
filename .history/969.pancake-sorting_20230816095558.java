/*
 * @lc app=leetcode id=969 lang=java
 *
 * [969] Pancake Sorting
 */

// @lc code=start
class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int len = arr.length;
        while(len > 1){
            int max = 0;
            int maxIndex = 0;
            for(int i=0;i<len;i++){
                if(arr[i]>max){
                    max = arr[i];
                    maxIndex = i;
                }
            }
            if(maxIndex == len-1){
                len--;
                continue;
            }
            res.add(maxIndex+1);
            reverse(arr, 0, maxIndex+1);
            res.add(len);
            reverse(arr,0,len);
            len--;
        }
        return res;
    }

    public void reverse(int[] arr, int left ,int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
}
// @lc code=end

