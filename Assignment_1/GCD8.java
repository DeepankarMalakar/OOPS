// 8. Java Program to Find GCD of two Numbers.
import java.util.Scanner;

public class GCD8 {
    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("GCD: " + findGCD(a, b));
        sc.close();
    }
}
