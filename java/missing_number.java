// ======================================
// LeetCode Problem: missing number
// Language: java
// Link: https://leetcode.com/problems/missing-number/
// Synced by: LinkCode
// Date: 11/19/2026, 2:27:07 PM
// ======================================


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected_sum = n*(n+1)/2;
        int actual_sum =0;
        for(int num:nums){
            actual_sum += num;
        }
        return (expected_sum - actual_sum);
    }
}