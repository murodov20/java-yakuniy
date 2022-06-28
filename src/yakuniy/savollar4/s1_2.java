package yakuniy.savollar4;

import java.util.Scanner;

public class s1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int manfiy = 0, musbat = 0, n = 3;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] < 0) {
                manfiy++;
            }
            if (a[i] > 0) {
                musbat++;
            }
        }

        System.out.println("manfiy = " + manfiy);
        System.out.println("musbat = " + musbat);
    }
}
