// Q6. Replace Profanity in Text 
// Problem Statement:  
// A social media platform wants to automatically replace  
// A social media platform wants to automatically replace offensive words with *** in user 
// in user-generated content. 
// Given a list of bad words, replace them in the input text. 
// , replace them in the input text. 
// Example Input/Output:  
// Bad Words List: "bad", "ugly", "stupid" 
// Input:  
// Enter text: This is a bad and ugly comment.  
// Output:  
// Filtered text: This is a *** and *** comment. 

import java.util.*;

class ProfanityFilter {
    public String filterText(String text, List<String> badWords) {
        for (String word : badWords) {
            text = text.replaceAll("\\b" + word + "\\b", "***");
        }
        return text;
    }
}

class Profanity6 {
    public static void main(String[] args) {
        ProfanityFilter pf = new ProfanityFilter();
        List<String> badWords = Arrays.asList("bad", "ugly", "stupid");
        String inputText = "This is a bad and ugly comment.";
        System.out.println("Filtered Text: " + pf.filterText(inputText, badWords));
    }
}