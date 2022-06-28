package yakuniy.savollar4;

import java.util.Scanner;

public class s13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1 || n > 999) {
            System.out.println("Notogri son berildi");
        }
        String str = "";
        if (n < 10) {
            str = "1 xonali";
        } else if (n < 100) {
            str = "2 xonali";
        } else  {
            str = "3 xonali";
        }

        if (n % 2 == 0) {
            str = str + " juft son";
        } else  {
            str = str + " toq son";
        }

        System.out.println(str);
    }
}
