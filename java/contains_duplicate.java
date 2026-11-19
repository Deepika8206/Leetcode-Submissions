// ======================================
// LeetCode Problem: contains duplicate
// Language: java
// Link: https://leetcode.com/problems/contains-duplicate/
// Synced by: LinkCode
// Date: 11/19/2026, 2:25:43 PM
// ======================================


import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false; 
    }
}