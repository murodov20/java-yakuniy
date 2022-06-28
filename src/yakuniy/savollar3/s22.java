package yakuniy.savollar3;

import java.util.Scanner;

public class s22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), a = scanner.nextDouble();
        double y = scanner.nextDouble(), b = scanner.nextDouble();

        double x1 = a / x, y1 = b / y, farq = x1 - y1;

        System.out.println("shokolad 1kg - " + x1);
        System.out.println("iris 1kg - " + y1);
        System.out.println("farq " + farq);
    }
}
