// ======================================
// LeetCode Problem: merge sorted array
// Language: java
// Link: https://leetcode.com/problems/merge-sorted-array/
// Synced by: LinkCode
// Date: 11/19/2026, 1:54:45 PM
// ======================================


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j >=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}
