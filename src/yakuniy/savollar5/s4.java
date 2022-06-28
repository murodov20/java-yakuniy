package yakuniy.savollar5;

import java.util.Scanner;

public class s4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), sum = 0;
        for (int i = a; i <= b; i++) {
            sum += (i * i);
        }
        // yoki agar a va b ni kiritmasak:
        // for (int i = a; i <= b; i++) {
        //    sum += (i * i);
        //}

        System.out.println(sum);
    }
}
