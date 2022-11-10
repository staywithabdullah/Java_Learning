import java.util.Scanner;

public class Chess_Ratings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();

            if ((y - x) % 8 == 0) {
                System.out.println((y - x) / 8);
            } else {
                System.out.println((y - x) / 8 + 1);
            }
        }
        in.close();
    }
}
