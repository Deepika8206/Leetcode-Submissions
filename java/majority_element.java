// ======================================
// LeetCode Problem: majority element
// Language: java
// Link: https://leetcode.com/problems/majority-element/
// Synced by: LinkCode
// Date: 11/19/2026, 2:24:57 PM
// ======================================


class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate=0;
        for(int num:nums){
            if(count ==0){
                candidate =num;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}