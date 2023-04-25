
import java.util.Scanner;

public class Lease2_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        int year = scan.nextInt();

        int k = scan.nextInt();

        for (int i = 1; i <= k; ++i) {
            int x = scan.nextInt();
            boolean check = true;
            for (int j = 1; j <= n; ++j) {
                int count = year + array[j] - 1;
                if (x > count) {
                    System.out.print(j + " ");
                    check = false;
                }
            }
            if (check) {
                System.out.print("full");
            }
            System.out.println();
        }       
    }
}
