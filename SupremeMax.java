
import java.util.Scanner;

public class SupremeMax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = scan.nextInt();

        }
        int max = 0;
        int supmax = 0;
        int first = 0;
        int walk = 0;
        int last = 0;
        for (int i = 0; i < n; ++i) {
            if (array[i] == 0) {//เริ่มช่วงใหม่
                System.out.print(max + " ");//ปริ้นค่าที่มากที่สุดในแต่ละช่วง
                if (max > supmax) {
                    supmax = max;
                    first = walk;
                    last = i - 1;
                }
                walk = i + 1;//เก็บค่าเริ่มต้นของแต่ละช่วง
                //System.out.println("walk" + walk);
                max = 0;
            } else {
                if (array[i] > max) {
                    max = array[i];//หาค่าที่มากที่สุด
                }
            }
        }
        System.out.println("\n" + supmax);
        //System.out.println(first + " " + last);
        for (int i = first; i <= last; ++i) {
            System.out.print(array[i] + " ");
        }
    }

}
/* 

1. รับค่า n แทนจำนวนตัวเลขทั้งหมด n ตัว ในอาเรย์
2. รับค่าในอาเรย์เข้ามาไม่เกิน n ตัว
ผลลัพธ์
1. ค่าที่มากที่สุดในแต่ละช่วง
2. ค่าที่มากที่สุดของทุกช่วง
3. ช่วงที่มีเลขของค่าที่มากที่สุด
 */
