import java.util.Scanner;

public class Cut_paper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();

            System.out.println((n / k) * (n / k));
        }
        in.close();
    }
}
