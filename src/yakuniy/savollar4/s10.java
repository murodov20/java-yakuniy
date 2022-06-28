package yakuniy.savollar4;

import java.util.Scanner;

public class s10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), f;

        if (x < -2 || x > 2) {
            f = 2 * x;
        } else {
            f = -3 * x;
        }

        System.out.println(f);
    }
}
