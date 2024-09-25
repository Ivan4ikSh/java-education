/**
 * Практика #2: Примеры использования оператора instanceof
 *
 * @author Ivan
 */
public class Main {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Integer number = 42;

        boolean is_string = text instanceof String;
        boolean is_integer = number instanceof Integer;
        System.out.println("text instanceof String: " + is_string);
        System.out.println("number instanceof Integer: " + is_integer);

        String null_string = null;
        boolean is_null_string = null_string instanceof String;
        System.out.println("null instanceof String: " + is_null_string);
    }
}