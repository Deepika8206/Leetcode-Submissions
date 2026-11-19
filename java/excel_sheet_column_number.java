// ======================================
// LeetCode Problem: excel sheet column number
// Language: java
// Link: https://leetcode.com/problems/excel-sheet-column-number/
// Synced by: LinkCode
// Date: 11/19/2026, 2:25:10 PM
// ======================================


class Solution {
    public int titleToNumber(String columnTitle) {
        int result =0;
        for(int i =0;i<columnTitle.length();i++){
            char c = columnTitle.charAt(i);
            int value = c - 'A' +1;
            result = result*26+value;
        }
        return result;
    }
}