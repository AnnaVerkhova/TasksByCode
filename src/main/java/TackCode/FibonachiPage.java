package TackCode;

import java.util.Scanner;

public class FibonachiPage {
    /**
     * вычислить число Фибоначчи
     */

    static int number;
    static int x = 0;
    static int y = 0;
    static int z = 1;

    public static void enter(int number) {
        Scanner scannerQ = new Scanner(System.in);
        System.out.println("Введите количество значений");
        number = scannerQ.nextInt();
        scannerQ.close();
        System.out.println("Серия чисел Фибоначчи: ");
        for (int i = 0; i <= number; i++) {
            x = y;
            y = z;
            z = x + y;
            System.out.println(x + "");
        }
    }
}
