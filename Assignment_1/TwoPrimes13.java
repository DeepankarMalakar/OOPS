// 13. Java Program to Check Whether a Number can be Expressed as Sum of Two Prime 
// Numbers.
public class TwoPrimes13 {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 34;
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " = " + i + " + " + (num - i));
                return;
            }
        }
        System.out.println("Cannot be expressed as sum of two primes.");
    }
}
