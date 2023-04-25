
import java.util.Scanner;

public class OutBound {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        int y = scan.nextInt();
        boolean check = false;
        for (int i = 1; i <= n; ++i) {
            if(array[i]<x||array[i]>y){
                System.out.print(array[i]+" ");
                check = true;
            }
        }
        if(!check){
            System.out.println("no data");
        }
    }
}
