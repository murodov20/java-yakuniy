package yakuniy.savollar5;

import java.util.Scanner;

public class s18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), previousNumber = 1, nextNumber = 1;

        int i = 1;
        int[] massiv = new int[n];
        while (i <= n) {
            massiv[i - 1] = previousNumber;
            System.out.println(massiv[i - 1]);
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }

    }
}
