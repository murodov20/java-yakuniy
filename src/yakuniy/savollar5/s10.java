package yakuniy.savollar5;

import java.util.Scanner;

public class s10 {

    static boolean isDaraja(int n, int daraja) {
        if (n <= 0) {
            return false;
        }
        if (n % daraja == 0) {
            return isDaraja(n / daraja, daraja);
        }
        if (n == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isDaraja(n, 3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
