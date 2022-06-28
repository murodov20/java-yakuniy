package yakuniy.savollar5;

import java.util.Scanner;

public class s9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt(), step = k;

        int i = 0, qoldiq = 0;
        while (step <= n) {
            i++;
            qoldiq = n - step;
            step += k;
        }

        System.out.println("butun qismi: " + i);
        System.out.println("qoldiq: " + qoldiq);
    }
}
