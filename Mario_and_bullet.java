import java.util.Scanner;

public class Mario_and_bullet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            if ((z - y / x) < 1) {
                System.out.println(0);
            } else if ((z - y / x) >= 1) {
                System.out.println((z - (y / x)));
            }
        }
        in.close();
    }
}
