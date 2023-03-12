package StraemApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NegativeAndPositivNumbers {
    /**
     * Написать методы:
     * который отрицательные числа делает положительными и возвращает коллекцию ([1, 5, -3, 7] -> [1, 5, 3, 7])
     */
    public static void main(String[] args) {
        List<Integer> collect = Stream.of(1, 5, -3, 7)
                .map(x -> x < 0 ? -x : x)
                .collect(Collectors.toList());
        System.out.println(collect.toString());
    }
}
