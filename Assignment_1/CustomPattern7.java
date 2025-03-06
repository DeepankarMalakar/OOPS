// 7.  Write a java program to print the following sequence: 
// 2, 1, 4, 2, 6, 6, 8, 24, 10, and so on up to a given limit.
public class CustomPattern7 {
    public static void main(String[] args) {
        int a = 2, b = 1, limit = 10;
        System.out.print("Sequence: ");
        for (int i = 0; i < limit; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp * (i + 1);
        }
    }
}
