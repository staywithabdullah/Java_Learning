import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();

            double persantage = ((double) y / (double) x) * 100;
            System.out.println(persantage);
            if (persantage >= 50) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        in.close();
    }

}
