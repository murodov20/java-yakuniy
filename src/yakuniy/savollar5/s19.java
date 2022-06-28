package yakuniy.savollar5;

import java.util.Scanner;

public class s19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Barcha juft sonlar: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
                k++;
            }
        }
        System.out.println("Umumiy soni: " + k);
    }
}
