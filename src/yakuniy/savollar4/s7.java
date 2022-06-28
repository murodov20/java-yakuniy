package yakuniy.savollar4;

import java.util.Scanner;

public class s7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        if (a < b && b < c) {
            a = a * 2;
            b = b * 2;
            c = c * 2;
        } else {
            a = -a;
            b = -b;
            c = -b;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
