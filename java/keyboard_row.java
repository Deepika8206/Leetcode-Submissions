// ======================================
// LeetCode Problem: keyboard row
// Language: java
// Link: https://leetcode.com/problems/keyboard-row/
// Synced by: LinkCode
// Date: 11/19/2026, 7:13:23 PM
// ======================================


class Solution {
    public String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));
        List<String> result = new ArrayList<>();
        for(String word:words){
            String lower = word.toLowerCase();
            Set<Character> target;
            if(row1.contains(lower.charAt(0))){
                target = row1;
            }
            else if(row2.contains(lower.charAt(0))){
                target = row2;
            }
            else{
                target = row3;
            }
            boolean valid = true;
            for(char c: lower.toCharArray()){
                if(!target.contains(c)){
                    valid = false;
                    break;
                }
            }
            if(valid){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}