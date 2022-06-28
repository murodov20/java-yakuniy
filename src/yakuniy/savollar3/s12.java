package yakuniy.savollar3;

import java.util.Scanner;

public class s12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble(), x2 = scanner.nextDouble();

        double l = Math.abs(x2 - x1);
        System.out.println(l);
    }
}
