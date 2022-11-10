import java.util.Scanner;

public class Tax_in_Chefland {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int x = in.nextInt();
            if (x > 100) {
                System.out.println(x - 10);
            } else
                System.out.println(x);
        }
        in.close();
    }

}
