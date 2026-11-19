// ======================================
// LeetCode Problem: find the difference
// Language: java
// Link: https://leetcode.com/problems/find-the-difference/
// Synced by: LinkCode
// Date: 11/19/2026, 7:10:34 PM
// ======================================


class Solution {
    public char findTheDifference(String s, String t) {
        int [] count = new int[26];
        for(int i =0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i =0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
            if(count[t.charAt(i)-'a']<0)return t.charAt(i);
        }
        return ' ';
    }
}