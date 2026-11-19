// ======================================
// LeetCode Problem: teemo attacking
// Language: java
// Link: https://leetcode.com/problems/teemo-attacking/
// Synced by: LinkCode
// Date: 11/19/2026, 7:13:01 PM
// ======================================


class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total =0;
        for(int i=0;i<timeSeries.length-1;i++){
            int gap = timeSeries[i+1]-timeSeries[i];
            if(gap>=duration){
                total +=duration;
            }
            else{
                total+=gap;
            }
        }
        total+=duration;
        return total;
    }
}