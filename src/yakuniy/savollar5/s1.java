package yakuniy.savollar5;

import java.util.Scanner;

public class s1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double narx1x = scanner.nextDouble();

        for (double i = 1.2; i <= 2; i+=0.2) {
            System.out.println(i * narx1x);
        }
    }
}
