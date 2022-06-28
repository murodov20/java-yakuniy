package yakuniy.savollar5;

import java.util.Scanner;

public class s8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), n = scanner.nextInt(), s = 1;
        for (int i = 0; i < n; i++) {
            s = (int) (s + Math.pow(a, i + 1));
        }

        System.out.println(s);
    }
}
