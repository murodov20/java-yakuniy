package yakuniy.savollar3;

import java.util.Scanner;

public class s21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), a = scanner.nextDouble(), y = scanner.nextDouble();

        double x1 = a / x, xy = x1 * y;

        System.out.println("1 kg - " + x1);
        System.out.println("y kg - " + xy);
    }
}
