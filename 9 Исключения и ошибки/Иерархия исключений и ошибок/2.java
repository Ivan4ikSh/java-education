public class Main {
    public static void main(String[] args) {
        // Пример 1: ArithmeticException
        try {
            int result = 10 / 0; // Деление на ноль вызывает ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!");
        }

        // Пример 2: ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            int number = array[5]; // Попытка доступа к несуществующему индексу
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс за пределами массива!");
        }

        // Пример 3: IllegalArgumentException
        try {
            printPositiveNumber(-5); // Передача некорректного аргумента
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: Аргумент должен быть положительным!");
        }

        // Пример 4: ClassCastException
        try {
            Object obj = new Integer(10);
            String str = (String) obj; // Приведение типа Integer к String вызывает ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Ошибка: Неверное приведение типов!");
        }

        // Пример 5: NullPointerException
        try {
            String str = null;
            int length = str.length(); // Попытка вызова метода у null вызывает NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Попытка обращения к null-объекту!");
        }
    }

    // Метод для примера IllegalArgumentException
    public static void printPositiveNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть положительным!");
        }
        System.out.println("Число: " + number);
    }
}
