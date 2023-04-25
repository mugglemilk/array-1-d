
import java.util.Scanner;

public class NumberOccurrence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            array[i] = scan.nextInt();
        }
        int pos = scan.nextInt();
        boolean check = false;
        for (int i = 1; i <= n; ++i) {
            if(array[i] == pos){
                System.out.print(i+" ");
                check = true;
            }          
        }
        if(!check){
            System.out.println(0);
        }
    }
}
