package StraemApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyOnA {
    /**
     * 2.3. Есть стринговый лист фамилий, нужно пройтись по списку,
     * вытащить фамилии которые начинаются на А и поместить их в другой список для дальнейшей работы с ними
     */
    public static void main(String[] args) {
        List<String> families = Arrays.asList("Абрамов", "Иванов", "Петров", "Сидоров", "Авраменко");
        families.stream()
                .filter(name -> name.startsWith("А"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
