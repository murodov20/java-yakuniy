package yakuniy.savollar3;

import java.util.Scanner;

public class s8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble(), b = scanner.nextDouble();
        double s = a + b, c = a - b, p = a * b, q = Math.abs(a / b);

        System.out.println("a + b = " + s);
        System.out.println("a - b = " + c);
        System.out.println("a * b = " + p);
        System.out.println("|a / b| = " + q);
    }
}
