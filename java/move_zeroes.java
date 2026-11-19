// ======================================
// LeetCode Problem: move zeroes
// Language: java
// Link: https://leetcode.com/problems/move-zeroes/
// Synced by: LinkCode
// Date: 11/19/2026, 2:27:21 PM
// ======================================


class Solution {
    public void moveZeroes(int[] nums) {
        int j =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!= 0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
}