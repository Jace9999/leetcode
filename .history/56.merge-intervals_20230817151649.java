/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start

import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        int[] newIntervals = intervals[0];
        list.add(newIntervals);
        for(int i=1;i<intervals.length;i++){
            int newInterval = list.get(list.size()-1);
            if(intervals[0] > newInterval[1]){
                list.add(newInterval);
            }else{
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }
        int[][] res = new int[list.size()][2];
        int x = 0;
        for(int[] i: list){
            res[x++] = i;
        }
        return res;
    }
}
// @lc code=end

