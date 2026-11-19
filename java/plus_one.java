// ======================================
// LeetCode Problem: plus one
// Language: java
// Link: https://leetcode.com/problems/plus-one/
// Synced by: LinkCode
// Date: 11/19/2026, 1:54:12 PM
// ======================================


class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1 ; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newarr = new int[digits.length+1];
        newarr[0] =1;
        return newarr;
    }
}