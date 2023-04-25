
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kanyanat Pumiwatr
 */
public class CondoSale {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        final int p = scan.nextInt();
        final int LastPos = p + n - 1;
        boolean[] sold = new boolean[n];
        boolean[] available = new boolean[n];

        final int k = scan.nextInt();
        int count = 0;
        for (int i = 0; i < k; ++i) {
            int pos = scan.nextInt();
            if (pos >= p && pos <= LastPos) {
                int index = pos - p;
                if (sold[index] == false) {
                    sold[index] = true;
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int index = 0; index < n; ++index) {
            if (sold[index]) {
                System.out.println(index + p);
            }
        }
    }
}
