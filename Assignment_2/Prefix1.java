// Q1. Longest Common Prefix 
// Write a function to find the longest common prefix string amongst an array of strings. If there is no common  prefix, return an empty string "".  
// Example 1:  
// Input: strs = ["flower","flow","flight"]  
// Output: "fl"  

class LongestCommonPrefix {
    public String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}

class Prefix1 {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + lcp.findLongestCommonPrefix(strs));
    }
}