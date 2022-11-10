import java.util.Scanner;

public class Elevatop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int x = (b - c) + (c - 1);
            int y = (a - 1);
            if (x > y) {
                System.out.println('1');
            } else if (y > a) {
                System.out.println('2');
            } else
                System.out.println('3');
        }
        in.close();
    }

}
