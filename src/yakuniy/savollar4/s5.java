package yakuniy.savollar4;

import java.util.Scanner;

public class s5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int min = a, max = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("min - " + min);
        System.out.println("max - " + max);
    }
}
