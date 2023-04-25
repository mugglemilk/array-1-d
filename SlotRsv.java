
import java.util.Scanner;

public class SlotRsv {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int p = scan.nextInt();

        int[] array1 = new int[n + 1];
        int[] array2 = new int[n + 1];

        for (int i = 1; i <= p; ++i) {
            int x = scan.nextInt();

            if (array1[x] < k) {
                array1[x] += 1;
                System.out.println(1);
            } else {
                array2[x] += 1;
                System.out.println(2);
            }
        }
        for (int i = 1; i <= n; ++i) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        for (int i = 1; i <= n; ++i) {
            System.out.print(array2[i]+" ");
        }
    }
}
