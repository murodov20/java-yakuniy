package yakuniy.savollar5;

import java.util.Scanner;

public class s11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = 1;
        while (k * k < n) {
            k++;
        }
        System.out.println(k);
    }
}
