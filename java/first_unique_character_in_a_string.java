// ======================================
// LeetCode Problem: first unique character in a string
// Language: java
// Link: https://leetcode.com/problems/first-unique-character-in-a-string/
// Synced by: LinkCode
// Date: 11/19/2026, 7:10:24 PM
// ======================================


class Solution {
    public int firstUniqChar(String s) {
        int [] count = new int[26];
        for(int i =0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i =0;i<s.length();i++){
            if(count[s.charAt(i)-'a']==1)return i;
        }
        return -1;
    }
}