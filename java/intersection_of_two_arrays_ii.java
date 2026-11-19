// ======================================
// LeetCode Problem: intersection of two arrays ii
// Language: java
// Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/
// Synced by: LinkCode
// Date: 11/19/2026, 2:28:56 PM
// ======================================


import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(map.containsKey(num)&&map.get(num)>0){
                result.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int [] output = new int[result.size()];
        for(int i = 0;i<result.size();i++){
            output[i]=result.get(i);
        }
        return output;
    }
}