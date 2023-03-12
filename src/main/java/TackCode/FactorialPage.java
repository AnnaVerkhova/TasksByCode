package TackCode;

import java.util.Scanner;

public class FactorialPage {
    /**
     * вычислить факториал
     */
    static int num;
    public static void factorial() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
