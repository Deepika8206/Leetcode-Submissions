// ======================================
// LeetCode Problem: next greater element i
// Language: java
// Link: https://leetcode.com/problems/next-greater-element-i/
// Synced by: LinkCode
// Date: 11/19/2026, 7:13:12 PM
// ======================================


import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int num:nums2){
            while(!stack.isEmpty() && stack.peek()<num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }
        int [] result = new int[nums1.length];
        for(int i =0 ; i<nums1.length;i++){
            result[i]=map.get(nums1[i]);
        }
        return result;
    }
}