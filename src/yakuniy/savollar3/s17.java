package yakuniy.savollar3;

import java.util.Scanner;

public class s17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), y = 4 * Math.pow(x - 3, 6) - 7 * Math.pow(x - 3, 3) + 2;

        System.out.println(y);
    }
}
