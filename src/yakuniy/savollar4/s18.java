package yakuniy.savollar4;

import java.util.Scanner;

public class s18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double massa = scanner.nextDouble();
        int birlik = scanner.nextInt();
        if (birlik < 0 || birlik > 5) {
            System.out.println("Notog'ri birlik");
        }

        switch (birlik) {
            case 1:
                System.out.println(massa / 1000000);
                break;
            case 2:
                System.out.println(massa / 1000);
                break;
            case 3:
                System.out.println(massa);
                break;
            case 4:
                System.out.println(massa * 100);
                break;
            case 5:
                System.out.println(massa * 1000);
                break;
        }
    }
}
