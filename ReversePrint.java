
import java.util.Scanner;

public class ReversePrint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        for(int i=n;i>=1;--i){
            System.out.print(array[i]+" ");
        }
    }
}
