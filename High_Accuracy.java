import java.util.Scanner;

public class High_Accuracy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int x = in.nextInt();

            int y = x / 3;

            if (y * 3 == x) {
                System.out.println(0);
            } else if (y * 3 < 100) {
                y++;
                int z = y * 3;
                System.out.println(z - x);
            } else if (y * 3 > x) {
                System.out.println((y * 3) - x);
            }

        }
        in.close();
    }
}