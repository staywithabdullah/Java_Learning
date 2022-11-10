import java.util.Scanner;

public class Building_Race {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int a = in.nextInt();

            int b = in.nextInt();

            int x = in.nextInt();

            int y = in.nextInt();

            if ((float) x / a < (float) y / b) {
                System.out.println("CHEFINA");
            } else if ((float) x / a > (float) y / b) {
                System.out.println("CHEF");
            } else if ((float) x / a == (float) y / b) {
                System.out.println("BOTH");
            }

        }
        in.close();
    }
}
