// 15. Write a program to generate 5 Random nos. between 1 to 100.
import java.util.Random;

public class RandomNums15 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.print("Random Numbers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(rand.nextInt(100) + 1 + " ");
        }
    }
}
