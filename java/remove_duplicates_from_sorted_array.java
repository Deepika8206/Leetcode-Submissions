// ======================================
// LeetCode Problem: remove duplicates from sorted array
// Language: java
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Synced by: LinkCode
// Date: 11/19/2026, 1:52:27 PM
// ======================================


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)return 0;
        int i=0;
        for ( int j= 1;j<nums.length;j++){
            if(nums[j] != nums[i] ){
                i++;
                nums[i] =nums[j];
            }
        } 
        return i+1;
        }
    }
