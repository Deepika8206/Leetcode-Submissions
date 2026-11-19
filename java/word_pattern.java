// ======================================
// LeetCode Problem: word pattern
// Language: java
// Link: https://leetcode.com/problems/word-pattern/
// Synced by: LinkCode
// Date: 11/19/2026, 2:27:49 PM
// ======================================


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length)return false;
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> reversemap = new HashMap<>();
        for(int i =0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(word)) return false;
            }
            else{
                map.put(c,word);
            }
            if(reversemap.containsKey(word)){
                if(reversemap.get(word)!=c )return false;
            }else{
                reversemap.put(word,c);
            }
        }
        return true;
    }
}