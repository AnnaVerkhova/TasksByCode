package TackCode;

public class PalindromPage {
    /**
     * написать метод который определяет является ли строка "Аргентина манит негра" палиндромом
     */
    static String str = "Аргентина манит негра";
    static StringBuffer buffer = new StringBuffer(str);

    public void palindrom() {
        buffer.reverse();
        String data = buffer.toString();
        if (str.equals(data)) {
            System.out.println("Введенное значение является палиндромом");
        } else {
            System.out.println("Введенное значение не является палиндромом");
        }
    }
}
