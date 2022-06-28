package yakuniy.savollar5;

import java.util.Scanner;

public class s15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), a = scanner.nextInt(), d = scanner.nextInt();
        int[] massiv = new int[n];
        for (int i = 0; i < n; i++) {
            massiv[i] = a + i * d;
            System.out.println(massiv[i]);
        }
    }
}
