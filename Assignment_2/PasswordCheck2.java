// Q2. Password Checker  
// You are given a function.  
// int CheckPassword(char str[], int n);  
// The function accepts string str of size n as an argument. Implement the function which returns 1 if given string  str is valid password else 0.  
// str is a valid password if it satisfies the below conditions.  
//  – At least 4 characters  
//  – At least one numeric digit  
//  – At Least one Capital Letter  
//  – Must not have space or slash (/)  
//  – Starting character must not be a number  
// Assumption: Input string will not be empty.  
// Example:  
// Input:  
// aA1_67  
// Output:  
// 1  

class PasswordChecker {
    public int checkPassword(String str) {
        if (str.length() < 4) return 0;
        if (Character.isDigit(str.charAt(0))) return 0;
        if (str.contains(" ") || str.contains("/")) return 0;
        boolean hasDigit = false, hasUpper = false;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) hasDigit = true;
            if (Character.isUpperCase(ch)) hasUpper = true;
        }
        return (hasDigit && hasUpper) ? 1 : 0;
    }
}

class PasswordCheck2 {
    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker();
        String password = "aA1_67";
        System.out.println("Password Valid: " + pc.checkPassword(password));
    }
}