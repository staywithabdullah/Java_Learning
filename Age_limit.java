import java.util.Scanner;

public class Age_limit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int A = in.nextInt();

            if (A >= X && A < Y) {
                System.out.println("YES");
            } else
                System.out.println("NO");

        }
        in.close();
    }

}
