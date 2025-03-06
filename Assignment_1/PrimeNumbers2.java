// 2.  Write a java program to print primes from 1 to 1000.
public class PrimeNumbers2 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 1000:");
        for (int num = 2; num <= 1000; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
