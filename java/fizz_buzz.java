// ======================================
// LeetCode Problem: fizz buzz
// Language: java
// Link: https://leetcode.com/problems/fizz-buzz/
// Synced by: LinkCode
// Date: 11/19/2026, 7:11:17 PM
// ======================================


import java.util.*;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i<=n;i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }
            else if(i%3==0){
                result.add("Fizz");
            }
            else if(i%5==0){
                result.add("Buzz");
            }
            else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}