// 5.  Write a java program to print the following sequence: 
// 0,-1,1,-4,1,-7,2,-10,3,-13,5,-16,8,... up to a given limit.
public class AlternateSeries5 {
    public static void main(String[] args) {
        int a = 0, b = -1, limit = 10;
        System.out.print("Sequence: ");
        for (int i = 0; i < limit; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp - 3;
        }
    }
}
