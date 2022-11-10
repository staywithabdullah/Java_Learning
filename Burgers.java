import java.util.Scanner;

public class Burgers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int A = in.nextInt();
            int B = in.nextInt();
            if (A >= B) {
                System.out.println(B);
            } else
                System.out.println(A);
        }
        in.close();
    }
}
