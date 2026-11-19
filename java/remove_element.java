// ======================================
// LeetCode Problem: remove element
// Language: java
// Link: https://leetcode.com/problems/remove-element/
// Synced by: LinkCode
// Date: 11/19/2026, 1:53:04 PM
// ======================================


class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}