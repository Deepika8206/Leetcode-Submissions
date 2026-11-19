// ======================================
// LeetCode Problem: assign cookies
// Language: java
// Link: https://leetcode.com/problems/assign-cookies/
// Synced by: LinkCode
// Date: 11/19/2026, 7:12:16 PM
// ======================================


class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i =0;
        int j =0;
        while(i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                i++;
                }
            j++;
    }
    return i;
}}