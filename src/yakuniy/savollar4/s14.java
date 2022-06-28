package yakuniy.savollar4;

import java.util.Scanner;

public class s14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        switch (k){
            case 1:
                System.out.println("yomon");
                break;
            case 2:
                System.out.println("qoniqarsiz");
                break;
            case 3:
                System.out.println("qoniqarli");
                break;
            case 4:
                System.out.println("yaxshi");
                break;
            case 5:
                System.out.println("a'lo");
                break;
            default:
                System.out.println("xato");
        }
    }
}
