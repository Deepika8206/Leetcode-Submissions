// ======================================
// LeetCode Problem: excel sheet column title
// Language: java
// Link: https://leetcode.com/problems/excel-sheet-column-title/
// Synced by: LinkCode
// Date: 11/19/2026, 2:24:44 PM
// ======================================


class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber%26;
            char ch = (char)(rem+'A');
            result.append(ch);
            columnNumber = columnNumber/26;
        }
        return result.reverse().toString();

    }
}