class Parent {
    public void display() {
        System.out.println("Метод display в Parent");
    }
}

class Child extends Parent {
    @Override
    public void display() { // Правильное переопределение
        System.out.println("Метод display в Child");
    }

    /*
    @Override
    public void displa() { // Ошибка: метод не переопределяет ничего в суперклассе
        System.out.println("Метод display в Child");
    }
    */
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Вызовет правильный метод display из класса Child
    }
}

/*
Если раскомментировать строку с неправильным именем метода display, компилятор выдаст ошибку:
text
error: method does not override or implement a method from a supertype

Таким образом, использование аннотации @Override помогает предотвратить ошибки при переопределении методов и делает код более понятным.
 */