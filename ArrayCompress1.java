
import java.util.Scanner;

public class ArrayCompress1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = scan.nextInt();
        }
        int k = scan.nextInt();//ค่ากั้นแบ่ง

        int sum = 0;
        for (int i = 0; i < n; ++i) {
            if(array[i] != k){
                sum += array[i];
                
            }else{
                System.out.print(sum + " " + k + " ");
                sum = 0;
            }
            if(i == n-1){
                System.out.print(sum);
            }
        }
    }
}
