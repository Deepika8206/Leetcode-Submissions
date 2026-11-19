// ======================================
// LeetCode Problem: single number
// Language: java
// Link: https://leetcode.com/problems/single-number/
// Synced by: LinkCode
// Date: 11/19/2026, 2:24:20 PM
// ======================================


class Solution {
    public int singleNumber(int[] nums) {
        int result = 0; 
        for(int num:nums){
            result = result^num;
        }
        return result;
    }
}