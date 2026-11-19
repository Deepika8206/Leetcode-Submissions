// ======================================
// LeetCode Problem: is subsequence
// Language: java
// Link: https://leetcode.com/problems/is-subsequence/
// Synced by: LinkCode
// Date: 11/19/2026, 7:10:45 PM
// ======================================


class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0;
        int j =0;
        while(i<s.length()&& j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}