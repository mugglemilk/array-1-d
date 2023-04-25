
import java.util.Scanner;

public class OddEvenZero2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n+1];
        for(int i=1;i<=n;++i){
            array[i]=scan.nextInt();
        }
        int maxOdd=0;
        int maxEven=0;
        for(int i=1;i<=n;++i){
            if(array[i]==0 || array[i]%2!=0){
                if(array[i]>maxOdd){
                    maxOdd=array[i];
                    System.out.print(maxOdd+" ");
                }
                else if(array[i]==0){
                    maxOdd=0;
                    System.out.print(maxOdd+" ");
                }
            }
        }
        System.out.println();
        for(int i=1;i<=n;++i){
            if(array[i]==0 || array[i]%2==0){
                if(array[i]>maxEven){
                    maxEven=array[i];
                    System.out.print(maxEven+" ");
                }
                else if(array[i]==0){
                    maxEven=0;
                    System.out.print(maxEven+" ");
                }
            }
        }
    }
}
