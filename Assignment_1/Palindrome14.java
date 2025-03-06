// 14. Write a java program to check whether a given number is palindrome number or not.
import java.util.Scanner;

public class Palindrome14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), temp = num, rev = 0;
        
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        
        if (num == rev)
            System.out.println(num + " is a Palindrome.");
        else
            System.out.println(num + " is not a Palindrome.");
        
        sc.close();
    }
}
