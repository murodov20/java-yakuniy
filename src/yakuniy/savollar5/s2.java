package yakuniy.savollar5;

import java.util.Scanner;

public class s2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        // yoki agar a va b ni kiritmasak:
        // for (int i = a; i <= b; i++) {
        //    sum += i;
        //}

        System.out.println(sum);
    }
}
