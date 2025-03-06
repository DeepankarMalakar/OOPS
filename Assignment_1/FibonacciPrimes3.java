// 3.  Write a java program to print a Fibonacci sequence where only first 8 positive prime 
// numbers are present. Also print the prime numbers separately.
import java.util.ArrayList;

public class FibonacciPrimes3 {
    public static void main(String[] args) {
        int first = 0, second = 1;
        ArrayList<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < 8) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes.add(num);
            num++;
        }
        System.out.println("First 8 prime numbers: " + primes);
        System.out.println("Fibonacci sequence using these primes:");
        for (int i = 0; i < primes.size(); i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
