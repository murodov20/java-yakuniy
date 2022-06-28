package yakuniy.savollar5;

import java.util.Scanner;

public class s5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double s = 0;
        for (int i = 1; i < n; i++) {
            s = s + 1 / i;
        }
        System.out.println(s);
    }
}
