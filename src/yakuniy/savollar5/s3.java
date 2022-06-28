package yakuniy.savollar5;

import java.util.Scanner;

public class s3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), p = 1;
        for (int i = a; i <= b; i++) {
            p *= i;
        }
        // yoki agar a va b ni kiritmasak:
        // for (int i = a; i <= b; i++) {
        //    p *= i;
        //}

        System.out.println(p);
    }
}
