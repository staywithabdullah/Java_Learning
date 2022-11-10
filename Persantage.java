import java.util.Scanner;

public class Persantage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int x = in.nextInt();

            int y = in.nextInt();

            int per = y / x;
            // float percentage=(y/x)*100;
            System.out.println(per);
            if (per >= 50) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        in.close();
    }
}
