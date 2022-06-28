package yakuniy.savollar4;

import java.util.Scanner;

public class s2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble();

        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
