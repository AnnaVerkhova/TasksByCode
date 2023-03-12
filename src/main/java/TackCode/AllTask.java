package TackCode;

public class AllTask {

    public static void main(String[] args) {
        System.out.println("Перевернуть строку «Никогда не ошибается тот, кто ничего не делает», изменив расположение символов в строке задом наперёд без использования встроенной в String функции reverse().");
        new StringPage().stringTurnOver();
        System.out.println("\nПодсчитать количество конкретных слов в строке 'Упади семь раз и восемь раз поднимись', используя HashMap.");
        new StringPage().hashMap();
        System.out.println("\nЗаменить символ '*'в строке 'Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро.' на символ 'а' ");
        new StringPage().replaceSymbol();
        System.out.println("\nУдалить символ '!' в строке 'Работать нужно не 12 часов, а головой!'");
        new StringPage().deleteSymbol();
        System.out.println("\nПодсчитать сколько раз символ 'В' встречается в строке 'Работать нужно не 12 часов, а головой!', учитывая различные раскладки");
        new StringPage().characterBRepeat();
        System.out.println("\nВывести строку 'Работать нужно не 12 часов, а головой!' 3 раза с разделителем");
        new StringPage().enterString();
        System.out.println("\nНаписать метод который определяет является ли строка 'Аргентина манит негра' палиндромом");
        new PalindromPage().palindrom();
        System.out.println("\nНаписать метод который определяет является ли слово анаграммой (обезьянство, место, мечеть)");
        new AnagrammaPage().anagrama();
        System.out.println("\nВычислить число Фибоначчи");
        new FibonachiPage().enter(10);
    }
}
