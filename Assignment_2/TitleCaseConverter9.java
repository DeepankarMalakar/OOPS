// Q9. Convert Sentence to Title Case 
// Problem Statement:  
// A content editing software needs a function to convert a sentence into title case (i.e., the first letter of each  word should be uppercase). 
// Example Input/Output:  
// Input:  
// Enter sentence: java programming is fun  
// Output:  
// Title Case: Java Programming Is Fun 

import java.util.stream.Collectors;
import java.util.Arrays;
class TitleCaseConverter {
    public String toTitleCase(String sentence) {
        String[] words = sentence.split(" ");
        return Arrays.stream(words)
                .map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1))
                .collect(Collectors.joining(" "));
    }
}

class TitleCaseConverter9 {
    public static void main(String[] args) {
        TitleCaseConverter tcc = new TitleCaseConverter();
        System.out.println("Title Case: " + tcc.toTitleCase("hello world from java"));
    }
}