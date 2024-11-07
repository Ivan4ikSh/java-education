import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        // Создание объекта StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        // Добавляем строки в StringJoiner
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        // Выводим результат
        System.out.println(joiner.toString()); // Вывод: [Apple, Banana, Cherry]
    }
}
