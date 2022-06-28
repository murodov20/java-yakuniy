package yakuniy.savollar3;

import java.util.Scanner;

public class s15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        int temp = b;
        b = c;
        c = a;
        a = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
