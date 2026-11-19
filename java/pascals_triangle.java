// ======================================
// LeetCode Problem: pascals triangle
// Language: java
// Link: https://leetcode.com/problems/pascals-triangle/
// Synced by: LinkCode
// Date: 11/19/2026, 2:23:31 PM
// ======================================


import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for ( int j =0;j <=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    int val = result.get(i-1).get(j-1)+result.get(i-1).get(j);
                    row.add(val);
                }
            }
            result.add(row);
        }
        return result;
    }
}