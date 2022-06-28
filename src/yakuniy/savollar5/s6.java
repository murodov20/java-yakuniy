package yakuniy.savollar5;

import java.util.Scanner;

public class s6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), s = 0;
        for (int i = n; i < n * 2; i++) {
           s += Math.pow(i, 3);
        }

        System.out.println(s);
    }
}
