// ======================================
// LeetCode Problem: array partition
// Language: java
// Link: https://leetcode.com/problems/array-partition/
// Synced by: LinkCode
// Date: 11/19/2026, 7:13:49 PM
// ======================================


class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sums =0;
        for(int i=0;i<nums.length;i+=2){
            sums+=nums[i];
        }
        return sums;
    }
}