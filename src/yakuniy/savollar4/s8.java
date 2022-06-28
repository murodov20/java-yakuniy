package yakuniy.savollar4;

import java.util.Scanner;

public class s8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 4, toq_count = 0, juft_count = 0, toq_index = 0, juft_index = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] % 2 == 0) {
                juft_count++;
                juft_index = i + 1;
            } else  {
                toq_count++;
                toq_index = i + 1;
            }
        }

        int index = juft_count > toq_count ? toq_index : juft_index;

        System.out.println(index);
    }
}
