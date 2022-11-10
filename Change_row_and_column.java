import java.util.Scanner;

public class Change_row_and_column {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int a2 = in.nextInt();
            int b2 = in.nextInt();

            if (a == a2 || b == b2) {
                System.out.println("2");
            } else
                System.out.println("1");
        }
        in.close();

    }
}
