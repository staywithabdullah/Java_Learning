import java.util.Scanner;

public class Minimum_Pizzas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- > 0) {
            int N = in.nextInt();
            int X = in.nextInt();

            if ((N * X) % 4 == 0) {
                System.out.println((N * X) / 4);
            } else {
                System.out.println((N * X) / 4 + 1);
            }

        }
        in.close();
    }

}
