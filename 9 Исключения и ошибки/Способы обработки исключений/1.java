public class Main {
    public static void main(String[] args) {
        try {
            methodThatThrowsExceptions();
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        // Второе исключение не будет перехвачено
        methodThatCausesRuntimeException();
    }

    public static void methodThatThrowsExceptions() {
        // Генерация деления на ноль (ArithmeticException)
        int result = 10 / 0; // Это вызовет ArithmeticException
        System.out.println("Результат: " + result);
    }

    public static void methodThatCausesRuntimeException() {
        // Генерация NullPointerException
        String str = null;
        System.out.println("Длина строки: " + str.length()); // Это вызовет NullPointerException
    }
}