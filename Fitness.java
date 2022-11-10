import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int x = in.nextInt();
            System.out.println((x * 2) * 5);
        }
        in.close();
    }
}
