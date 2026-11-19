// ======================================
// LeetCode Problem: valid parentheses
// Language: java
// Link: https://leetcode.com/problems/valid-parentheses/
// Synced by: LinkCode
// Date: 11/19/2026, 1:52:11 PM
// ======================================


import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('|| c=='{'||c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty())return false;
                char top=stack.pop();
                if(c==')'&&top!='(')return false;
                if(c=='}'&&top!='{')return false;
                if(c==']'&&top!='[')return false;
            }
        }
        return stack.isEmpty();
    }
}