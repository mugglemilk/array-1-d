
import java.util.Scanner;

public class Box1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int[] sum = new int[n + 1];//ของที่มี
        for (int i = 1; i <= k; ++i) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();

            if (x == 1) {
                if (array[z] >= sum[z]+ y) {
                    sum[z] += y;
                    System.out.println(sum[z]);
                } else {
                    System.out.println(-1);
                }
            } else if (x == 2) {
                if (sum[z] >= y) {
                    sum[z] -= y;
                    System.out.println(sum[z]);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
