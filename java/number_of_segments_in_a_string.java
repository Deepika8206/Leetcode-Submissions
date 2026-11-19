// ======================================
// LeetCode Problem: number of segments in a string
// Language: java
// Link: https://leetcode.com/problems/number-of-segments-in-a-string/
// Synced by: LinkCode
// Date: 11/19/2026, 7:11:52 PM
// ======================================


class Solution {
    public int countSegments(String s) {
        int count =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!=' ' && (i ==0||s.charAt(i-1)==' ')){
                count++;
            }
        }
        return count;
    }
}