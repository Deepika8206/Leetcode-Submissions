// ======================================
// LeetCode Problem: find the index of the first occurrence in a string
// Language: java
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Synced by: LinkCode
// Date: 11/19/2026, 1:53:25 PM
// ======================================


class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle))return i;
        }
        return -1;
    }
}