final class FinalClass {
    public void show() {
        System.out.println("Это финальный класс.");
    }
}

// Попытка создать подкласс приведет к ошибке компиляции
class SubClass extends FinalClass {
    public void show() {
        System.out.println("Это подкласс.");
    }
}

public class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();

        // SubClass subObj = new SubClass(); // Это вызовет ошибку компиляции
    }
}