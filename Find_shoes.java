import java.util.Scanner;

public class Find_shoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();

            if (m >= n) {
                System.out.println(n);
            } else {
                int a = n + (n - m);
                System.out.println(a);
            }

        }
        in.close();
    }
}
