package yakuniy.savollar3;

import java.util.Scanner;

public class s19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt(), a2 = a * a, a5 = a2 * a2 * a;
        long a15 = a5 * a5 * a5;

        System.out.println("a15 = " + a15);
    }
}
