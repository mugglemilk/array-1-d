
import java.util.Scanner;

public class Lease1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] year = new int[n];
        for (int i = 0; i < n; ++i) {
            year[i] = scan.nextInt();
        }
        int begin = scan.nextInt();
        
        for(int i=0 ; i<n ; ++i){
            int count = (begin+year[i])-1;
            System.out.print(count + " ");
        }
    }
}
