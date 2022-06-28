package yakuniy.savollar5;

import java.util.Scanner;

public class s7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(Math.pow(a, i + 1));
        }
    }
}
