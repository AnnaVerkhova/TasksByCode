package StraemApi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numbers {
    /**
     * Написать методы:
     * 2.2. который четные числа умножает на 100, а от нечетных отнимает 100 и возвращает коллекцию.
     * Количество принимаемых и возвращаемых элементов коллекций должно совпадать
     */
    public static void main(String[] args) {
        Numbers.chetNumber();
        Numbers.inChetNumber();
    }

    public static void chetNumber() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 8, 1, 6, 3, 4);
        numbers.parallel()
                .filter(p -> p % 2 == 0)
                .map(p -> p * 100)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void inChetNumber() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 8, 1, 6, 3, 4);
        numbers.parallel()
                .filter(x -> x % 2 != 0)
                .map(p -> p - 100)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
