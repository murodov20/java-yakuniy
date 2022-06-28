package yakuniy.savollar4;

import java.util.Scanner;

public class s20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double son = scanner.nextDouble();
        double a, r1, r2, s;
        int birlik = scanner.nextInt();
        if (birlik < 0 || birlik > 4) {
            System.out.println("Notog'ri birlik");
        }

        switch (birlik) {
            case 1:
                a = son;
                break;
            case 2:
                a = son * 6 / Math.sqrt(3);
                break;
            case 3:
                a = son * 12 / Math.sqrt(3);
                break;
            default:
                a = Math.sqrt(3 * son / Math.sqrt(3));
        }
        r1 = a * Math.sqrt(3) / 6;
        r2 = r1 * 2;
        s = a * a * Math.sqrt(3) / 4;

        System.out.println("a = " + a);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("S = " + s);
    }
}
