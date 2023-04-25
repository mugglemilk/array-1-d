
import java.util.Scanner;

public class TrainTicker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int order = scan.nextInt();
        int[] array = new int[n + 1];

        for (int i = 1; i <= order; ++i) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            boolean check = true;
            for (int j = x; j < y; ++j) {
                if (array[j] + z > k) {
                    check = false;
                }
            }
            if (!check) {
                System.out.println("N");
            } else {
                for (int j = x; j < y; ++j) {
                    array[j] += z;
                }
                System.out.println("Y");
            }
            
        }
    }
}
