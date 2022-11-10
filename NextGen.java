import java.util.Scanner;

public class NextGen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {
            int A = in.nextInt();
            int B = in.nextInt();
            int X = in.nextInt();
            int Y = in.nextInt();

            if ((X * Y) >= (A * B)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        in.close();
    }

}
