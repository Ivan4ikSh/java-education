/**
 * @author Ivan Shupayev
 */
// Определяем интерфейс
interface MyInterface {
    // Неабстрактный метод с реализацией
    default void display() {
        System.out.println("This is a default method in the interface.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }
}

// Реализуем интерфейс в классе
class MyClass implements MyInterface {
    // Можно переопределить метод display()
    @Override
    public void display() {
        System.out.println("This is the overridden method in MyClass.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Вызов неабстрактного метода
        myClass.display(); // Выведет: This is the overridden method in MyClass.

        // Вызов статического метода интерфейса
        MyInterface.staticMethod(); // Выведет: This is a static method in the interface.
    }
}
