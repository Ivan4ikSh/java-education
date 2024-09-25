/**
 * Класс Calculator реализует простые арифметические операции.
 *
 * @author Ivan
 * @version 1.0
 */
public class Main {
    /**
     * Возвращает сумму двух чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return результат сложения двух чисел
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Возвращает разность двух чисел.
     *
     * @param a первое число
     * @param b второе число
     * @return результат вычитания второго числа из первого
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Выбрасывает исключение, если деление на ноль.
     *
     * @param a делимое
     * @param b делитель
     * @return результат деления
     * @throws IllegalArgumentException если делитель равен нулю
     */
    public static int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return a / b;
    }

    //Главная функция вызова для проверки функционала
    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(subtract(3,1));
        System.out.println(divide(1,2));
        System.out.println(divide(13,0));
    }
}