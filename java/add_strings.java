// ======================================
// LeetCode Problem: add strings
// Language: java
// Link: https://leetcode.com/problems/add-strings/
// Synced by: LinkCode
// Date: 11/19/2026, 7:11:41 PM
// ======================================


class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry =0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        while(i>=0 || j>=0 || carry !=0){
            int sum  = carry;
            if(i>=0){
                sum += num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum += num2.charAt(j) -'0';
                j--;
            }
            result.append(sum%10);
            carry = sum/10;
        }
        return result.reverse().toString();
    }
}