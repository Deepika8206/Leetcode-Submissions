// ======================================
// LeetCode Problem: third maximum number
// Language: java
// Link: https://leetcode.com/problems/third-maximum-number/
// Synced by: LinkCode
// Date: 11/19/2026, 7:11:29 PM
// ======================================


import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(set.size()<3){
            int max = Integer.MIN_VALUE;
            for(int num:set){
                if(num>max){
                    max =num;
                }
            }
            return max;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int num:set){
            if(num>first){
                third=second;
                second=first;
                first=num;
            }
            else if(num>second){
                third=second;
                second=num;
            }
            else if(num> third){
                third=num;
            }
        }
        return third;
    }
}