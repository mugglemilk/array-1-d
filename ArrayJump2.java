
import java.util.Scanner;

public class ArrayJump2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        int jump = k;
        for (;;) {
            if (jump > n) {
                System.out.println("out of bounds");
                break;
            } else {
                System.out.println(jump + " " + array[jump]);
                jump += array[jump];
            }
        }
    }
}
