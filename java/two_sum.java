// ======================================
// LeetCode Problem: two sum
// Language: java
// Link: https://leetcode.com/problems/two-sum/
// Synced by: LinkCode
// Date: 11/19/2026, 1:50:34 PM
// ======================================


import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}