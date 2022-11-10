import java.util.Scanner;

public class Java_basics {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // sout for print function
        // use of integer

        // int choda = 85, boka = 50;
        // int sum = boka + choda;
        // int abs = boka - choda;
        // System.out.println(sum);
        // System.out.println("Sum= " + sum + " \nAbs=" + abs);

        float u;
        float c;
        u = 85.2f;
        System.out.println(u);
        c = 7.5f;
        System.out.println(c);

        // intro variable...
        int n = 8;
        System.out.println("Integer: " + n);
        float f = 9.8f;// use f in the end.
        System.out.println("Float: " + f);
        double x = 8.5;
        System.out.println("Double: " + x);
        short s = 87;
        System.out.println(s);
        long l = 874254867684l;// use l in the end..
        System.out.println(l);
        byte b = 87;// Range -128 to 127.
        System.out.println(b);
        char ch = 'h';
        System.out.println(ch);
        String str = "Limon bokachoda";
        System.out.println(str);
        boolean bl = true;
        System.out.println(bl);
        in.close();

    }

}
