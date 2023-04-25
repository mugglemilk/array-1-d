
import java.util.Scanner;

public class Lease1_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        int year = scan.nextInt();
        
        
        for (int i = 1; i <= n; ++i) {
            int count = year+array[i]-1;
            System.out.print(count+" ");
        }
    }
}
