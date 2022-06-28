package yakuniy.savollar5;

import java.util.Scanner;

public class s14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) Math.pow(2, i + 1);
            System.out.println(a[i]);
        }
    }
}
