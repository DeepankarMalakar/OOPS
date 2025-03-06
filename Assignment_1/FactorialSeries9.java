// 9. Write a java program to print sum of n terms in the series 1/1! +1/2!+1/3!....
public class FactorialSeries9 {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double fact = 1;
            for (int j = 1; j <= i; j++) fact *= j;
            sum += 1 / fact;
        }
        System.out.println("Sum of series: " + sum);
    }
}
