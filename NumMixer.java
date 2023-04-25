
import java.util.Scanner;

public class NumMixer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            A[i] = scan.nextInt();
        }
        int[] B = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            B[i] = scan.nextInt();
        }

        int k = scan.nextInt();

        if (k > 0) {
            for (int i = 1; i <= n; ++i) {
                System.out.print(A[i] + " " + B[n - i + 1] + " ");
            }
        } else if (k <= 0) {
            for (int i = 1; i <= n; ++i) {
                System.out.print(B[n-i+1] + " " + A[i] + " ");
            }
        }
    }
}
