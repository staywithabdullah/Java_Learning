import java.util.Scanner;

public class Chefland_Games {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int r1 = in.nextInt();
            int r2 = in.nextInt();
            int r3 = in.nextInt();
            int r4 = in.nextInt();

            if (r1 == 0 && r2 == 0 && r3 == 0 && r4 == 0) {
                System.out.println("IN");
            } else
                System.out.println("OUT");

        }
        in.close();
    }
}
