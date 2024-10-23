/**
 * @author Ivan Shupayev
 */
class OuterClass {
    private String outerField = "Outer field";

    public class InnerClass {
        void displayOuter() {
            System.out.println("Accessing outer field from InnerClass: " + outerField);
        }
    }

    public void createInner() {
        InnerClass inner = new InnerClass();
        inner.displayOuter(); // Вызов метода внутреннего класса
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInner(); // Создаем внутренний класс и выводим данные
    }
}
/*
Внутренний класс InnerClass имеет доступ ко всем полям и методам внешнего класса OuterClass, независимо от их спецификаторов доступа.
Это позволяет внутренним классам использовать состояния внешнего класса.
*/
