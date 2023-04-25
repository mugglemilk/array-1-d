
import java.util.Scanner;

public class HowLongest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        int start = 0;
        int max = 0;
        int[] array2 = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            int count = 0;
            if (array[i] == 1) {
                start = i;
                for (int j = i; j <= n; ++j) {
                    if (array[j] == 1) {
                        count++;
                    } else if (array[j] == 0) {
                        break;
                    }
                    if (count >= max) {
                        max = count;
                        array2[start] = count;
                    }
                }
            }
        }
        System.out.println(max);
        for (int i = 1; i <= n; ++i) {
            if (array2[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}
