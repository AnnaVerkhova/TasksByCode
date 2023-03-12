package StraemApi;

import java.util.ArrayList;
import java.util.Collections;

public class Summa {
    /**
     * написать метод, который найдет сумму нечетных чисел в коллекции
     */
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        Collections.addAll(number, 1, 2, 3, 5, 4, 1, 6);
        Integer integer = number.stream()
                .filter(p -> p % 2 != 0)
                .reduce((c1, c2) -> c1 + c2)
                .orElse(0);
        System.out.println(integer);
    }
}
