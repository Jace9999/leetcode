/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

// @lc code=start

import java.util.List;

class Solution {
public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> res = new ArrayList<>();
    int cur = 0;
    int len = intervals.length;
    while(cur < len && intervals[cur][1] < newInterval[0]){
        res.add(intervals[cur]);
        cur++;
    }
    while(cur < len && intervals[cur][0] <= newInterval[1]){
        newInterval[0] = Math.min(intervals[cur][0], newInterval[0]);
        newInterval[1] = Math.max(intervals[cur][1], newInterval[1]);
        cur++;
    }
    res.add(newInterval);

    while(cur<len){
        res.add(intervals[cur]);
        cur++;
    }
    return res.toArray(new int[res.size()][]);
}
}
// @lc code=end

