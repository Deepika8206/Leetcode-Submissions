// ======================================
// LeetCode Problem: convert sorted array to binary search tree
// Language: java
// Link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// Synced by: LinkCode
// Date: 11/19/2026, 2:23:19 PM
// ======================================


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums , 0 , nums.length -1);
    }
    private TreeNode buildTree(int nums[] , int left , int right){
        if (left > right) return null;
        int mid = left+(right - left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums,left , mid -1);
        root.right = buildTree(nums,mid+1,right);
        return root;
    }
}