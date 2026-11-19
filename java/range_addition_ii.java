// ======================================
// LeetCode Problem: range addition ii
// Language: java
// Link: https://leetcode.com/problems/range-addition-ii/
// Synced by: LinkCode
// Date: 11/19/2026, 7:14:36 PM
// ======================================


class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int mina = m;
        int minb = n;
        for(int []op :ops){
            mina = Math.min(mina,op[0]);
            minb = Math.min(minb,op[1]);
        }
        return mina*minb;
    }
}