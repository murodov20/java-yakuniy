package yakuniy.savollar4;

import java.util.Scanner;

public class s11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), f;

        if (x <= 0) {
            f = -x;
        } else if (x > 0 && x < 2) {
            f = x * x;
        } else {
            f = 4;
        }

        System.out.println(f);
    }
}
