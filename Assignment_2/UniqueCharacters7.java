// Q7. Unique Characters in a String  
// Problem Statement:  
// A company is developing a new security system that requires checking whether a given string has all unique  characters. You need to write a program that:  
//  Accepts a string from the user.  
//  Checks if all characters in the string are unique.  
// Example Input/Output:  
// Input 1:  
// Enter a string: abcde  
// Output 1:  
// All characters are unique.  


import java.util.Scanner;

class UniqueCharacters {
    public boolean hasUniqueChars(String str) {
        boolean[] charSet = new boolean[128]; // Assuming ASCII character set
        for (char c : str.toCharArray()) {
            if (charSet[c]) return false; // Duplicate found
            charSet[c] = true;
        }
        return true; // All characters are unique
    }
}

class UniqueCharacters7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        UniqueCharacters uc = new UniqueCharacters();
        if (uc.hasUniqueChars(input)) {
            System.out.println("All characters are unique.");
        } else {
            System.out.println("String contains duplicate characters.");
        }
    }
}
