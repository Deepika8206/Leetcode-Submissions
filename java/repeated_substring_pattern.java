// ======================================
// LeetCode Problem: repeated substring pattern
// Language: java
// Link: https://leetcode.com/problems/repeated-substring-pattern/
// Synced by: LinkCode
// Date: 11/19/2026, 7:12:27 PM
// ======================================


class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s+s;
        String trimmed = doubled.substring(1,doubled.length()-1);
        return trimmed.contains(s);
        
    }
}