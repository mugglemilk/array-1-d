
import java.util.Scanner;

public class ArrayOcc2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] array = new int[n + 1];

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 1; i <= k; ++i) {
            int x = scan.nextInt();
            if (x < 1 || x > n) {
                count1++;
            } else if (x >= 1 && x <= n) {
                if (array[x] == 0) {
                    array[x] = 1;
                    count2++;
                } else if (array[x] != 0) {
                    array[x] += 1;
                    count3++;
                }
            }
        }
        int max = 0;
        int end = 0;
        int[] maxOC = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            int count = 1;
            if (array[i] == 0) {
                end = i;
                for (int j = i + 1; j <= n; ++j) {
                    if (array[j] == 0) {
                        count++;
                        end = j;
                    } else {
                        break;
                    }
                }
                if (count >= max) {
                    max = count;
                    maxOC[end] = max;
                }
            }
        }
        System.out.println(max);

        for (int i = 1; i <= n; ++i) {
            if (maxOC[i] == max) {
                System.out.print(i + " ");
            }
        }
    }
}
