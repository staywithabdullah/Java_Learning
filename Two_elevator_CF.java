import java.util.Scanner;

public class Two_elevator_CF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int x = (a - 1);
            int y = (b - c) + (c - 1);
            if (x > y) {
                System.out.println('2');
            } else if (x < y) {
                System.out.println('1');
            } else if (x == y)
                System.out.println('3');
        }
        in.close();
    }
}
