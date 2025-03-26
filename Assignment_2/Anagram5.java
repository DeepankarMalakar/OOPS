// Q5. Anagram Check  
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.  
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.  
// Example 1:  
// Input: s = "anagram", t = "nagaram"  
// Output: true  
// Example 2:  
// Input: s = "rat", t = "car"  
// Output: false  

import java.util.Arrays;

class AnagramChecker {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}

class Anagram5 {
    public static void main(String[] args) {
        AnagramChecker ac = new AnagramChecker();
        System.out.println("Anagram: " + ac.isAnagram("anagram", "nagaram"));
    }
}