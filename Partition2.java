
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kanyanat Pumiwatr
 */
public class Partition2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int half = n / 2;
        int count = 0;
        int[] arraysum = new int[n];
        for (int i = 0; i < n; i++) {
            if (array[half] >= array[i]) {
                count++;
                arraysum[count] = array[i];
            }
        }
        int half2 = (count / 2) + 1;
    
        for (int i = 1; i <= count; i++) {
            if (arraysum[i] <= arraysum[half2]) {
                System.out.print(arraysum[i]+" ");
            }
        }
        System.out.println("");
        for (int i = 1; i <= count; i++) {
            if (arraysum[i] > arraysum[half2]) {
                System.out.print(arraysum[i]+" ");
            }
        }
    }
}
