/**
 * @author Ivan Shupayev
 */
class OuterClass {
    // Внешний класс
    private String outerField = "Outer field";

    // Приватный внутренний класс
    private class PrivateInner {
        void display() {
            System.out.println("Accessing from PrivateInner: " + outerField);
        }
    }

    // Публичный внутренний класс
    public class PublicInner {
        void display() {
            System.out.println("Accessing from PublicInner: " + outerField);
        }
    }

    // Защищенный внутренний класс
    protected class ProtectedInner {
        void display() {
            System.out.println("Accessing from ProtectedInner: " + outerField);
        }
    }

    // Метод внешнего класса для создания экземпляра внутреннего класса
    public void createInnerInstances() {
        PrivateInner privateInner = new PrivateInner();
        privateInner.display();

        PublicInner publicInner = new PublicInner();
        publicInner.display();

        ProtectedInner protectedInner = new ProtectedInner();
        protectedInner.display();
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerInstances();
    }
}
