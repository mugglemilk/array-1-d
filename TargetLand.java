
import java.util.Scanner;

public class TargetLand {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= k; ++i) {
            int x = scan.nextInt();//ที่ต้องการ
            int y = scan.nextInt();//ที่สนใจ

            int first = y - (x / 2);
            int last = y + (x / 2);

            if (first < 1 || last > n) {
                System.out.println("no");
            } else {
                for (int j = first; j <= last; ++j) {
                    sum += array[j];
                }
                System.out.println(sum);
                sum = 0;
            }
        }
    }
}
