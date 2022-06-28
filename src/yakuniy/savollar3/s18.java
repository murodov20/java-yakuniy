package yakuniy.savollar3;

import java.util.Scanner;

public class s18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), a2 = a * a, a4 = a2 * a2, a5 = a4 * a;

        System.out.println("a^2 = " + a2);
        System.out.println("a^4 = " + a4);
        System.out.println("a^5 = " + a5);
    }
}
