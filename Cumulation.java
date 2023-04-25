
import java.util.Scanner;

public class Cumulation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        int k = scan.nextInt();

        for (int i = 1; i <= k; ++i) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            for (int j = x; j <= y; ++j) {
                array[j] += z;
            }
            for (int j = 1; j < n; ++j) {
                System.out.print(array[j]+" ");
            }
            System.out.println();
        }
    }
}
