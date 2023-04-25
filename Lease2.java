
import java.util.Scanner;

public class Lease2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] year = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            year[i] = scan.nextInt();
        }
        int begin = scan.nextInt();

        int request = scan.nextInt();
        for (int i = 1; i <= request; ++i) {//request
            int begin2 = scan.nextInt();//ปีใน request
            boolean check = false;
            for (int j = 1; j <= n; ++j) {
                int count = (begin + year[j] - 1);

                if (count < begin2) {
                    System.out.print(j + " ");
                    check = true;
                }
            }
            
            if (!check) {
                System.out.print("full");
            }
            System.out.println("");
        }
    }
}
