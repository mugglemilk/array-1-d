
import java.util.Scanner;

public class Partition1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        int center = (n / 2) + 1;
        for (int i = 1; i <= n; ++i) {
            if (array[i] <= array[center]) {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
        for(int i = 1; i <= n; ++i){
            if (array[i] > array[center]) {
                System.out.print(array[i]+" ");
            }
        }
    }
}
