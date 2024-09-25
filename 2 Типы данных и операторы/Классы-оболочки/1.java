/**
 * Практика #1: Примеры использования методы decode()
 *
 * @author Ivan
 */
public class Main {
    public static void main(String[] args) {
        Integer decimal = Integer.decode("123");
        Integer hex = Integer.decode("0x7B");
        Integer octal = Integer.decode("0173");

        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Octal: " + octal);
    }
}