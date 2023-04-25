
import java.util.Scanner;

public class NumReduction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        for (int i = 1; i <= k; ++i) {
            int center = scan.nextInt();
            int y = scan.nextInt();
            int start = center - 2;
            int end = center + 2;
            if (start < 1) {
                start = 1;
            }
            if (end > n) {
                end = n;
            }
            for (int j = start; j <= end; ++j) {
                if (array[j] >= 0) {
                    if(y>array[j]){
                        array[j]=0;
                    }else{
                       array[j] -= y; 
                    }
                    
                }
                
            }
            for (int j = 1; j <= n; ++j) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
}
