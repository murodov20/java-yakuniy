package yakuniy.savollar4;

import java.util.Scanner;

public class s15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 2 || n == 12) {
            System.out.println("qish");
        }
        if (n >= 3 && n <= 5) {
            System.out.println("bahor");
        }
        if (n >= 6 && n <= 8) {
            System.out.println("yoz");
        }
        if (n >= 9 && n <= 11) {
            System.out.println("kuz");
        }
    }
}
