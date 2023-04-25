
import java.util.Scanner;

public class HowLong {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        for (int i = 1; i <= 3; ++i) {
            int x = scan.nextInt();
            int sum = 0;
            for (int j = x; j <= n; ++j) {
                if (array[j] == 0) {
                    System.out.println(sum);
                    break;
                }else if(array[j]==1){
                    sum++;
                }
                if(j==n){
                    System.out.println(sum);
                }
            }
        }
    }
}
