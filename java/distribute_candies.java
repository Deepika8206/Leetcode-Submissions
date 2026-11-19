// ======================================
// LeetCode Problem: distribute candies
// Language: java
// Link: https://leetcode.com/problems/distribute-candies/
// Synced by: LinkCode
// Date: 11/19/2026, 7:14:10 PM
// ======================================


class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int num:candyType){
            set.add(num);
        }
        int uniquetype = set.size();
        int maxallowed = candyType.length/2;
        
        return Math.min(uniquetype,maxallowed);
    }
}