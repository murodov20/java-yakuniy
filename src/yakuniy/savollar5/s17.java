package yakuniy.savollar5;

import java.util.Scanner;

public class s17 {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), f = fibonacci(n);

        System.out.println(f);
    }
}
