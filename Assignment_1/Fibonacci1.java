// 1.  Write a java program to print first 10 numbers in Fibonacci sequence. Also print the sum 
// of the numbers.
public class Fibonacci1 {
    public static void main(String[] args) {
        int n = 10, first = 0, second = 1, sum = 0;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            sum += first;
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println("\nSum of series: " + sum);
    }
}
