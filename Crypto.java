
import java.util.Scanner;

public class Crypto {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean check1 = false;
        boolean check2 = false;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        int key = scan.nextInt();

        for (int i = x; i < x + 4; i++) {
            if (i == x) {
                if (array[i] + key <= 51743) {
                    check1 = true;

                }
            }
            if (i == x + 1) {
                if (array[i] - key > 7832) {
                    check1 = true;

                }
            }
            if (i == x + 2) {
                if (array[i] - key < 2394) {
                    check2 = true;

                }
            }
            if (i == x + 3) {
                if (array[i] + key > 9213) {
                    check2 = true;

                }
            }
        }
        if (check1 == true) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        if (check2 == true) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        if (check1 == true && check2 == true) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
