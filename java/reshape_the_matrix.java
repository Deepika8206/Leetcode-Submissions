// ======================================
// LeetCode Problem: reshape the matrix
// Language: java
// Link: https://leetcode.com/problems/reshape-the-matrix/
// Synced by: LinkCode
// Date: 11/19/2026, 7:14:00 PM
// ======================================


class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        int [][]result = new int[r][c];
        for(int i =0;i<m*n;i++){
            int oldrow = i/n;
            int oldcol = i%n;
            int newrow = i/c;
            int newcol= i%c;
            result[newrow][newcol]=mat[oldrow][oldcol];
        }
        return result;
    }
}