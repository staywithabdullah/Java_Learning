import java.util.Scanner;

public class Watermelon_CF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        if (w % 2 == 0) {
            if (w == 2) {
                System.out.println("No");
            } else
                System.out.println("YES");
        } else
            System.out.println("NO");
        in.close();
    }
}
