package yakuniy.savollar4;

import java.util.Scanner;

public class s19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double son = scanner.nextDouble();
        double a, c, h, s;
        int birlik = scanner.nextInt();
        if (birlik < 0 || birlik > 4) {
            System.out.println("Notog'ri birlik");
        }

        switch (birlik) {
            case 1:
                a = son;
                break;
            case 2:
                a = son / Math.sqrt(2);
                break;
            case 3:
                a = 2 * son / Math.sqrt(2);
                break;
            default:
                a = Math.sqrt(2 * son);
        }
        c = a * Math.sqrt(2);
        h = c / 2;
        s = c * h / 2;

        System.out.println("a = " + a);
        System.out.println("c = " + c);
        System.out.println("h = " + h);
        System.out.println("S = " + s);
    }
}
