// ======================================
// LeetCode Problem: convert a number to hexadecimal
// Language: java
// Link: https://leetcode.com/problems/convert-a-number-to-hexadecimal/
// Synced by: LinkCode
// Date: 11/19/2026, 7:10:56 PM
// ======================================


class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        char [] hex ="0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();
        while(num!=0){
            int digit = num & 15;
            result.append(hex[digit]);
            num >>>=4;
        }
        return result.reverse().toString();
    }
}