/**
 * Практика #1: Примеры операторов для базовых типов
 *
 * @author Ivan
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int sum = a + b;
        System.out.println("Сложение: " + sum);

        a += 2;
        System.out.println("a после += 2: " + a);

        int diff = a - b;
        System.out.println("Разность: " + diff);

        int product = a * b;
        System.out.println("Произведение: " + product);

        int division = a / b;
        System.out.println("Деление: " + division);

        int remainder = a % b;
        System.out.println("Остаток: " + remainder);

        boolean is_equal = (a == b);
        boolean is_not_Equal = (a != b);
        System.out.println("a == b: " + is_equal);
        System.out.println("a != b: " + is_not_Equal);

        boolean logical_and = (a > 0 && b > 0);
        System.out.println("a > 0 && b > 0: " + logical_and);

        boolean logical_or = (a < 0 || b > 0);
        System.out.println("a < 0 || b > 0: " + logical_or);

        int x = 5;
        System.out.println("x до префиксного ++: " + x);
        System.out.println("префиксный ++x: " + ++x);
        System.out.println("постфиксный x++: " + x++);
        System.out.println("x после постфиксного x++: " + x);

        String hello = "Hello";
        String world = "World";
        String greeting = hello + " " + world;
        System.out.println("Конкатенация строк: " + greeting);

        String message = "Hello";
        message += " World";
        System.out.println("Результат += для строк: " + message);
    }
}