import java.util.Scanner;

public class Water_Bottles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int x = in.nextInt();
            int k = in.nextInt();

            if (n < (k / x)) {
                System.out.println(n);
            } else {
                System.out.println(k / x);
            }

        }
        in.close();
    }
}
