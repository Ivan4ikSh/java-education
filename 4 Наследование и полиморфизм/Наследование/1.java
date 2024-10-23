/**
 * @author Ivan Shupayev
 */

// Базовый класс
class A {
    int a1;              // package-private
    public int a2;      // public
    protected int a3;    // protected
    private int a4;      // private

    // Конструктор
    public A(int a1, int a2, int a3) {
        this.a1 = a1;  // Используем this для установки значений
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = 4;   // Установка значения private поля
    }

    // Публичный метод
    public void method2() {
        System.out.println("Public method in A: a2 = " + a2);
    }

    // Защищенный метод
    protected void method3() {
        System.out.println("Protected method in A: a3 = " + a3);
    }

    // Метод с переменным числом параметров
    public void printNumbers(int... numbers) {
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// Подкласс
class B extends A {
    public B(int a1, int a2, int a3) {
        super(a1, a2, a3); // Вызов конструктора суперкласса
    }

    // Переопределение метода
    @Override
    public void method2() {
        super.method2(); // Вызов метода суперкласса
        System.out.println("Overridden method in B: a2 = " + a2);
    }

    public void accessMembers() {
        // Доступ к членам суперкласса
        System.out.println("Accessing members in B:");
        System.out.println("a1 (package-private): " + a1);
        System.out.println("a2 (public): " + a2);
        System.out.println("a3 (protected): " + a3);
        // System.out.println("a4 (private): " + a4); // Ошибка, недоступно
    }
}

// Ещё один подкласс
class C extends B {
    public C(int a1, int a2, int a3) {
        super(a1, a2, a3); // Вызов конструктора суперкласса
    }

    public void accessMembers() {
        System.out.println("Accessing members in C:");
        System.out.println("a1 (package-private): " + a1);
        System.out.println("a2 (public): " + a2);
        System.out.println("a3 (protected): " + a3);
        // System.out.println("a4 (private): " + a4); // Ошибка, недоступно
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        B b = new B(1, 2, 3);
        b.method2(); // Вызываем переопределённый метод
        b.accessMembers(); // Доступ к членам класса B

        C c = new C(4, 5, 6);
        c.accessMembers(); // Доступ к членам класса C

        // Пример использования метода с переменным числом параметров
        b.printNumbers(1, 2, 3, 4, 5);
    }
}
