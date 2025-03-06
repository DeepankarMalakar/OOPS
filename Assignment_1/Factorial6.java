// 6. Write a java program to print Factorial of a given number. Use any loop.
import java.util.Scanner;

public class Factorial6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
        sc.close();
    }
}
