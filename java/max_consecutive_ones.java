// ======================================
// LeetCode Problem: max consecutive ones
// Language: java
// Link: https://leetcode.com/problems/max-consecutive-ones/
// Synced by: LinkCode
// Date: 11/19/2026, 7:12:50 PM
// ======================================


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max =0;
        for(int num:nums){
            if(num==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count =0;
            }
        }
        return max;
    }
}