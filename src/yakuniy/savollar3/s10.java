package yakuniy.savollar3;

import java.util.Scanner;

public class s10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = scanner.nextDouble(), pi = 3.14, r = l / (2 * pi), s = pi * r * r;

        System.out.println("r = " + r);
        System.out.println("s = " + s);
    }
}
