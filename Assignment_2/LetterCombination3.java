// Q3. Letter Combinations of a Phone Number 
// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could  represent. Return the answer in any order.  
// A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any  letters. 

import java.util.*;

class PhoneLetterCombinations {
    private static final String[] KEYPAD = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;
        backtrack(result, digits, "", 0);
        return result;
    }

    private void backtrack(List<String> result, String digits, String current, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            backtrack(result, digits, current + c, index + 1);
        }
    }
}

class LetterCombination3 {
    public static void main(String[] args) {
        PhoneLetterCombinations plc = new PhoneLetterCombinations();
        System.out.println("Combinations: " + plc.letterCombinations("23"));
    }
}
