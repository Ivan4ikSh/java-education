/**
 * @author Ivan Shupayev
 */
// Интерфейс с вложенным классом
interface MyInterface {
    // Вложенный класс в интерфейсе
    class NestedClass {
        public void displayMessage() {
            System.out.println("Hello from NestedClass inside MyInterface!");
        }
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр вложенного класса
        MyInterface.NestedClass nested = new MyInterface.NestedClass();

        // Вызываем метод вложенного класса
        nested.displayMessage();
    }
}
