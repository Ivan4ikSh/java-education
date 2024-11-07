import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        // Пример 1: Логическое значение (%b)
        boolean boolValue = true;
        formatter.format("Логическое значение: %b%n", boolValue);

        // Пример 2: Символьное представление (%c)
        char charValue = 'A';
        formatter.format("Символ: %c%n", charValue);

        // Пример 3: Десятичное целое (%d)
        int intValue = 123;
        formatter.format("Целое число: %d%n", intValue);

        // Пример 4: Десятичное значение с плавающей точкой (%f)
        double doubleValue = 123.456;
        formatter.format("Число с плавающей точкой: %.2f%n", doubleValue);

        // Пример 5: Строковое представление (%s)
        String stringValue = "Hello, Formatter!";
        formatter.format("Строка: %s%n", stringValue);

        // Вывод форматированной строки
        System.out.println(formatter);

        // Освобождение ресурсов
        formatter.close();
    }
}
