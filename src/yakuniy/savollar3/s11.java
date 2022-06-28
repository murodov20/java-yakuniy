package yakuniy.savollar3;

import java.util.Scanner;

public class s11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble(), pi = 3.14;
        double d = 2 * Math.sqrt(s / pi), l = d * pi;

        System.out.println("d = " + d);
        System.out.println("l = " + l);
    }
}
