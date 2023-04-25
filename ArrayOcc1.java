
import java.util.Scanner;

public class ArrayOcc1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] array = new int[n + 1];
        
        int count1=0;
        int count2=0;
        int count3=0;
        int max=0;
        for (int i = 1; i <= k; ++i) {
            int x = scan.nextInt();
            if(x<1||x>n){
                count1++;
            }else if(x>=1&&x<=n){
                if(array[x]==0){
                    array[x]=1;
                    count2++;
                }
                else if(array[x]!=0){
                    array[x]+=1;
                    count3++;
                }
                if(array[x]>max){
                    max=array[x];
                }
            }
        }
        System.out.println(count2);
        System.out.println(count1);
        System.out.println(count3);
        
        for(int i=1;i<=n;++i){
            if(array[i]==max){
                System.out.print(i+" ");
            }
        }
    }
}
