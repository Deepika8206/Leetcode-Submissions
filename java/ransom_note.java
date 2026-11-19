// ======================================
// LeetCode Problem: ransom note
// Language: java
// Link: https://leetcode.com/problems/ransom-note/
// Synced by: LinkCode
// Date: 11/19/2026, 7:10:13 PM
// ======================================


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] count = new int[26];
        for(int i=0;i<magazine.length();i++){
            count[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            count[ransomNote.charAt(i)-'a']--;
            if(count[ransomNote.charAt(i)-'a'] <0)return false;
        }
        return true;
    }
}