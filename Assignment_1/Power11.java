// 11. Java Program to Calculate the Power of a Number.
import java.util.Scanner;

public class Power11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        int base = sc.nextInt(), exp = sc.nextInt();
        System.out.println("Result: " + Math.pow(base, exp));
        sc.close();
    }
}
