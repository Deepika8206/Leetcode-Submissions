// ======================================
// LeetCode Problem: length of last word
// Language: java
// Link: https://leetcode.com/problems/length-of-last-word/
// Synced by: LinkCode
// Date: 11/19/2026, 1:54:00 PM
// ======================================


class Solution {
    public int lengthOfLastWord(String s) {
        int length =0;
        int i = s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;
    }
}