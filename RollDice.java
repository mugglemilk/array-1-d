
import java.util.Scanner;

public class RollDice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] pts = new int[n];
        for (int i = 0; i < n; ++i) {
            pts[i] = scan.nextInt();
        }
        int[] extra_move = new int[n];
        for (int i = 0; i < n; i++) {
            extra_move[i] = scan.nextInt();
        }
        int p = scan.nextInt();
        int loc = 0, score = 0;
        int walk = 0, scoretr = 0;
        for (int i = 0; i < p; ++i) {
            int move = scan.nextInt();
            loc = loc + move;
            if (loc > n - 1) {
                loc = loc - n; //1
                if (extra_move[loc] < 0) {
                    walk = n + extra_move[loc] + loc;
                    if (walk >= n) {
                        walk = walk - n;
                    }
                    //System.out.println("ww"+walk);
                } else {
                    walk = extra_move[loc] + loc;
                    //  System.out.println("www"+walk);
                }
                if (extra_move[loc] == 0) {
                    score = score + pts[loc];
                } else {
                   /* System.out.println("loc" + loc);
                    System.out.println("ss" + score);
                    System.out.println("pl" + pts[loc]);
                    System.out.println("pw" + pts[walk]);*/
                    score = score + pts[loc] + pts[walk];
                }
                loc = walk;
            } else if (extra_move[loc] < 0) {

                walk = loc + extra_move[loc];
                if (walk < 0) {
                    walk = n + walk;
                }
                score = score + pts[loc] + pts[walk];
                loc = walk;
            } else {
                walk = loc + extra_move[loc];
                if (walk > n - 1) {
                    walk = walk - n;
                }
                if (extra_move[loc] == 0) {
                    score = score + pts[loc];
                } else {
                    score = score + pts[loc] + pts[walk];
                }
                loc = walk;

            }
            System.out.println(walk + " " + score);

        }
    }
}
