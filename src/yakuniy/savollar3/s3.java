package yakuniy.savollar3;

import java.util.Scanner;

public class s3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), p = 2 * (a + b), s = a * b;

        System.out.println("p=" + p);
        System.out.println("s=" + s);
    }
}
