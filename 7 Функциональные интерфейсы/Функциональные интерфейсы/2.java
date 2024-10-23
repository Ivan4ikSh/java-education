/**
 * @author Ivan Shupayev
 */
// Первый интерфейс с неабстрактным методом
interface InterfaceA {
    default void show() {
        System.out.println("Show from InterfaceA");
    }
}

// Второй интерфейс с аналогичным методом
interface InterfaceB {
    default void show() {
        System.out.println("Show from InterfaceB");
    }
}

// Класс, реализующий оба интерфейса
class MyClass implements InterfaceA, InterfaceB {
    // Переопределяем метод show(), чтобы разрешить конфликт
    @Override
    public void show() {
        // Можно выбрать, какой метод вызывать
        InterfaceA.super.show(); // Вызывает метод из InterfaceA
        InterfaceB.super.show(); // Вызывает метод из InterfaceB
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.show();
    }
}
