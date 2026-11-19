// ======================================
// LeetCode Problem: island perimeter
// Language: java
// Link: https://leetcode.com/problems/island-perimeter/
// Synced by: LinkCode
// Date: 11/19/2026, 7:12:38 PM
// ======================================


class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    perimeter+=4;
                    if(i>0 && grid[i-1][j]==1){
                        perimeter-=2;
                        }
                        if(j>0 && grid[i][j-1]==1){
                            perimeter-=2;
                            }
                            }
        }}
        return perimeter;
    }
}