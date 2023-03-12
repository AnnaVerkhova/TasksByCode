package TackCode;

import org.apache.maven.surefire.shade.api.org.apache.maven.shared.utils.StringUtils;

import java.util.HashMap;

public class StringPage {
    /**
     * Перевернуть строку «Никогда не ошибается тот, кто ничего не делает», изменив расположение символов в строке задом наперёд без использования встроенной в String функции reverse().
     */
    public void stringTurnOver() {
        String str = "Никогда не ошибается тот, кто ничего не делает", nstr = "";
        char ch;
        System.out.print("Оригинальная строка: ");
        System.out.println("Никогда не ошибается тот, кто ничего не делает");

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Перевернутая строка: " + nstr);
    }

    /**
     * Подсчитать количество конкретных слов в строке "Упади семь раз и восемь раз поднимись", используя HashMap.
     */
    public void hashMap() {
        String st = "Упади семь раз и восемь раз поднимись";
        String[] words = st.split(" ");

        HashMap<String, Integer> keyValue = new HashMap<String, Integer>();
        for (int i = 0; i <= words.length - 1; i++) {
            if (keyValue.containsKey(words[i])) {
                int counter = keyValue.get(words[i]);
                keyValue.put(words[i], counter + 1);
            } else {
                keyValue.put(words[i], 1);
            }
        }
        System.out.println(st);
        System.out.println(keyValue);
    }

    /**
     * заменить символ " * " в строке "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро." на символ "а"
     */
    public void replaceSymbol() {
        String st = "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро.";
        System.out.println(st);
        System.out.println(st.replace('*', 'а'));
    }

    /**
     * удалить символ '! ' в строке "Работать нужно не 12 часов, а головой!"
     */
    public void deleteSymbol() {

        String st = "Работать нужно не 12 часов, а головой!";

        System.out.println(st);
        System.out.println(st.replaceFirst(".$", ""));
    }

    /**
     * вывести строку "Работать нужно не 12 часов, а головой!" 3 раза с разделителем
     */
    public void enterString() {
        String str = "Работать нужно не 12 часов, а головой! \n";
        String repeated = StringUtils.repeat(str, 3);
        System.out.println(repeated);
    }

    /**
     * Подсчитать сколько раз символ 'В' встречается в строке 'Работать нужно не 12 часов, а головой!', учитывая различные раскладки
     */
    public void characterBRepeat() {
        String str = "Работать нужно не 12 часов, а головой!";
        String[] lines = str.split("");
        String abc = "в";
        int count = 0;
        for (int i = 0; i < lines.length; i++) {
            if (abc.equals(lines[i])) {
                count = ++count + 0;
            }
        }
        System.out.println("Символ " + abc + " - " + count + " встречается");
    }
}
