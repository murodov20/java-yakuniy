package yakuniy.savollar5;

import java.util.Scanner;

public class s20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] % 2 != 0) {
                k++;
            }
        }
        if (k > 0) {
            int[] b = new int[k];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    b[j++] = a[i];
                }
            }

            for (int i = 0; i < b.length - 1; i++) {
                int index = i;
                for (int r = i + 1; r < b.length; r++) {
                    if (b[r] < b[index]) {
                        index = r;
                    }
                }
                int smallerNumber = b[index];
                b[index] = b[i];
                b[i] = smallerNumber;
            }
            for (int i = 0; i < k; i++) {
                System.out.println(b[i]);
            }
        }

        System.out.println("k = " + k);
    }
}
