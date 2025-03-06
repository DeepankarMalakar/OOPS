// 4.  Write a java program to print the following sequence: 
// 0,2,1,4,1,8,2,16,3,32,5,64,8,... up to a given limit.
public class CustomSeq4 {
    public static void main(String[] args) {
        int limit = 10, a = 0, b = 2;
        System.out.print("Sequence: ");
        for (int i = 0; i < limit; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = 2 * temp;
        }
    }
}
