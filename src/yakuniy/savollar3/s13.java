package yakuniy.savollar3;

import java.util.Scanner;

public class s13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble(), B = scanner.nextDouble(), C = scanner.nextDouble();

        double AB = Math.abs(A - B), BC = Math.abs(B - C), s = AB + BC;

        System.out.println("AB = " + AB);
        System.out.println("BC = " + BC);
        System.out.println("summa " + s);
    }
}
