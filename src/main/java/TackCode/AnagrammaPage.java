package TackCode;

import java.util.Arrays;

public class AnagrammaPage {
    /**
     * написать метод который определяет является ли слово анаграммой (обезьянство, место, мечеть)
     */
    static String s1 = "обезьянство";
    static String s2 = "место";
    static String s3 = "мечеть";

    public void anagrama() {
        char[] chs1 = s1.toCharArray();
        char[] chs2 = s2.toCharArray();
        char[] chs3 = s3.toCharArray();

        Arrays.sort(chs1);
        Arrays.sort(chs2);
        Arrays.sort(chs3);
        s1 = new String(chs1);
        s2 = new String(chs2);
        s3 = new String(chs3);

        if (s1.equals(s2)) {
            System.out.println("'Обезьянство' и 'место' являются анаграммами");
        } else if (s1.equals(s3)) {
            System.out.println("'Обезьянство' и 'мечеть' являются анаграммами");
        } else if (s2.equals(s3)) {
            System.out.println("'Mесто' и 'мечеть' являются анаграммами");
        } else {
            System.out.println("Слова не являются анаграммами");
        }
    }
}
