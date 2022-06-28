package yakuniy.savollar5;

import java.util.Scanner;

public class s16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double b = scanner.nextDouble(), q = scanner.nextDouble();
        double[] massiv = new double[n];
        for (int i = 0; i < n; i++) {
            massiv[i] = b * Math.pow(q, i);
            System.out.println(massiv[i]);
        }
    }
}
