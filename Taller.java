import java.util.Scanner;

public class Taller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();

            if (x > y) {
                System.out.println('A');
            } else if (y > x) {
                System.out.println('B');
            }

        }
        in.close();
    }
}
