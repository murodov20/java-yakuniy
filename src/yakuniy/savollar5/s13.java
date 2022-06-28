package yakuniy.savollar5;

import java.util.Scanner;

public class s13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];

        for (int j = 0; j < n; j++) {
            a[j] = (j * 2) + 1;
            System.out.println(a[j]);
        }
    }
}
