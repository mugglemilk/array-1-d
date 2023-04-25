
import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] array = new int[n+1];
        for(int i=1;i<=k;++i){
            int x = scan.nextInt();
            array[x]+=1;
        }
        int max=0;
        int no=0;
        for(int i=1;i<=n;++i){
            if(array[i]>max){
                max=array[i];
                no=i;
            }
        }
        System.out.print(no+"\n"+max);
    }
}
