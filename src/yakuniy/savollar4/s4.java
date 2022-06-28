package yakuniy.savollar4;

import java.util.Scanner;

public class s4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();

        if (a != b) {
            if (a > b) {
                b = a;
            } else {
                a = b;
            }
        } else {
            a = 0;
            b = 0;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
