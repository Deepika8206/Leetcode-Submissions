// ======================================
// LeetCode Problem: longest harmonious subsequence
// Language: java
// Link: https://leetcode.com/problems/longest-harmonious-subsequence/
// Synced by: LinkCode
// Date: 11/19/2026, 7:14:23 PM
// ======================================


import java.util.*;
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxlength=0;
        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                int length = map.get(key)+map.get(key+1);
                maxlength = Math.max(maxlength,length);
        }
    }
    return maxlength;
}}