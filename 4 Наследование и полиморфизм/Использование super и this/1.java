class Parent {
    int value;

    // Конструктор суперкласса
    public Parent(int value) {
        this.value = value;
        System.out.println("Конструктор Parent вызван. Значение: " + value);
    }

    void display() {
        System.out.println("Метод display в Parent. Значение: " + value);
    }
}

class Child extends Parent {
    int value; // Поле с тем же именем, что и в суперклассе

    public Child(int parentValue, int childValue) {
        super(parentValue); // Вызов конструктора суперкласса
        this.value = childValue; // Инициализация поля дочернего класса
        System.out.println("Конструктор Child вызван. Значение: " + value);
    }

    void display() {
        super.display(); // Вызов метода суперкласса
        System.out.println("Метод display в Child. Значение: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.display();
    }
}