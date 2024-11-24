class Parent {
    public final void display() {
        System.out.println("Это метод суперкласса.");
    }
}

class Child extends Parent {
    // Попытка переопределить метод display приведет к ошибке компиляции
    public void display() {
        System.out.println("Это метод подкласса.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Это вызовет ошибку компиляции
    }
}