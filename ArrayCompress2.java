
import java.util.Scanner;

public class ArrayCompress2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int sum = 0;
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == x || a[i] == y || a[i] == z) {
                if (i == 0) {
                    System.out.print(a[i] + " ");
                } else if (check) {
                    System.out.print(sum + " " + a[i] + " ");
                    check = false;
                    sum = 0;
                } else if (!check) {

                }

            } else if (i == n - 1) {
                sum += a[i];
                System.out.print(sum);
            } else {
                sum += a[i];
                check = true;
            }
        }
    }
}
