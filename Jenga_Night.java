import java.util.Scanner;

public class Jenga_Night {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int x = in.nextInt();

            if (x % n == 0) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
        in.close();
    }
}
