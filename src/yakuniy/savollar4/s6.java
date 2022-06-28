package yakuniy.savollar4;

import java.util.Scanner;

public class s6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int min = a, sum = b + c;
        if (b < min) {
            sum = a + c;
            min = b;
        }
        if (c < min) {
            sum = a + b;
        }

        System.out.println(sum);
    }
}
