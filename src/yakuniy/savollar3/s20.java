package yakuniy.savollar3;

import java.util.Scanner;

public class s20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        double tc = (t - 32) * 5 / 9;

        System.out.println(tc);
    }
}
