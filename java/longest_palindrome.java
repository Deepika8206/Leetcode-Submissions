// ======================================
// LeetCode Problem: longest palindrome
// Language: java
// Link: https://leetcode.com/problems/longest-palindrome/
// Synced by: LinkCode
// Date: 11/19/2026, 7:11:06 PM
// ======================================


class Solution {
    public int longestPalindrome(String s) {
        int [] count = new int[128];
        for(char c :s.toCharArray()){
            count[c]++;
        }
        int length =0;
        boolean hasodd = false;
        for(int num : count){
            if(num%2==0){
                length+=num;
            }else{
                length += num -1;
                hasodd = true;
            }
        }
        if(hasodd) length +=1;
            
        return length;
        

    }}
