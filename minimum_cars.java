import java.util.Scanner;

public class minimum_cars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();

            if (n <= 4) {
                System.out.println(1);
            } else if (n % 4 == 0) {
                System.out.println(n / 4);
            } else {
                System.out.println((n / 4) + 1);
            }
        }
        in.close();
    }
}
