// Q8. Find the Longest Word 
// Problem Statement:  
// A book editor tool requires a function to find the longest word in a given sentence.  Example Input/Output:  
// Input:  
// Enter sentence: Innovation distinguishes between a leader and a follower.  Output:  
// Longest Word: distinguishes 

import java.util.Arrays;
import java.util.Comparator;
class LongestWordFinder {
    public String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        return Arrays.stream(words).max(Comparator.comparingInt(String::length)).orElse("");
    }
}

class LongestWordFinder8 {
    public static void main(String[] args) {
        LongestWordFinder lwf = new LongestWordFinder();
        System.out.println("Longest Word: " + lwf.findLongestWord("The quickly brown fox jumps over the lazy dog"));
    }
}