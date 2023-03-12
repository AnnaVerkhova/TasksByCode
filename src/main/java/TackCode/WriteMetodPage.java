package TackCode;

import java.util.Scanner;

public class WriteMetodPage {
    /**
     * "Нужно написать метод, на вход которого подается число, нужно:
     * если число четное, вывести на экран сообщение, что это четное число
     * если число делится на 10, вывести одну десятую числа
     * если число делится на 3, вывести факториал этого числа
     * если выполняется несколько условий, выводим все соответствующие варианты"
     */

    public static void main(String[] args) {
        int n;
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n == 0) {
                System.out.println("На ноль делить нельзя");
            } else if (n % 2 == 0 & n % 10 == 0) {
                double k = n / 10;
                System.out.println("Число четное " + "и число делится на 10 = " + k);
            } else if (n % 3 == 0) {
                int result = 1;
                for (int i = 1; i <= n; i++) {
                    result = result * i;
                }
                System.out.println(result);
            } else if (n % 10 == 0) {
                double k = n / 10;
                System.out.println(k);
            } else if (n % 2 == 0) {
                System.out.println("Число четное");
            } else if (n == 0) {
                System.out.println("На ноль делить нельзя");
            } else {
                System.out.println("Скорее всего, вы допустили ошибку");
            }
        }
    }
}



