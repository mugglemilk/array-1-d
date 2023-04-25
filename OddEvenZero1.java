
import java.util.Scanner;

public class OddEvenZero1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }for (int i = 1; i <= n; ++i){
            if (array[i] == 0 || array[i]%2!=0) {
                System.out.print(array[i]+" ");
            }
        }        
        System.out.println();
        for (int i = 1; i <= n; ++i) {
            if (array[i] == 0 || array[i]%2==0) {
                System.out.print(array[i]+" ");
            }           
        }               
    }
}
