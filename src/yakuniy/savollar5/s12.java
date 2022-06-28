package yakuniy.savollar5;

import java.util.Scanner;

public class s12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), i = 0;
        double p = 1;
        while (n - i > 0) {
            p = p * (n - i);
            i+=2;
        }

        System.out.println(p);
    }
}
