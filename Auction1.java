
import java.util.Scanner;

public class Auction1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        for (int i = 1; i <= k; ++i) {
            for (int j = 1; j <= n; ++j) {
                int x = scan.nextInt();
                if(array[j]<x){
                    array[j]=x;
                }
                System.out.print(array[j]+" ");
            }
            System.out.println();
        }
    }
}
