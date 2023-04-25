
import java.util.Scanner;

public class Labor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array1 = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array1[i] = scan.nextInt();
        }
        int[] array2 = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array2[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= k; ++i) {
            int x = scan.nextInt();//ที่ต้องการ
            int y = scan.nextInt();//ที่สนใจ
            boolean check = false;
            int first = y - (x / 2);
            int last = y + (x / 2);

            if (first < 1 || last > n) {
                System.out.print("no ");
                if (first < 1) {
                    first = 1;
                }
                if (last > n) {
                    last = n;
                }
                for (int j = first; j <= last; ++j) {
                    sum += array1[j];
                }
                System.out.println(sum);

            } else {
                for (int j = first; j <= last; ++j) {
                    sum += array1[j];
                    if (array2[j] < 5) {
                        check = true;
                    }                    
                }               
                if (!check) {
                    System.out.println(sum + " labor");                    
                }else{
                    System.out.println(sum);  
                }               
            }            
            sum = 0;
        }
    }
}
