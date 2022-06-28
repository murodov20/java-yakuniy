package yakuniy.savollar3;

import java.util.Scanner;

public class s9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble();
        double c = Math.sqrt(a * a + b * b), p = a + b + c;

        System.out.println("gipotenuza - " + c);
        System.out.println("perimetr = " + p);
    }
}
