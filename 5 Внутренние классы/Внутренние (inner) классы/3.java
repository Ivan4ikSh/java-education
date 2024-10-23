/**
 * @author Ivan Shupayev
 */
class OuterClass {
    private String outerField = "Outer field";

    public class InnerClass {
        private String innerField = "Inner field";

        public void display() {
            System.out.println("Inner field: " + innerField);
        }
    }

    public void createInner() {
        InnerClass inner = new InnerClass();
        inner.display(); // Доступ к методу внутреннего класса
        System.out.println("Accessing innerField from OuterClass: " + inner.innerField); // Доступ к полю
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
Внешний класс OuterClass может получить доступ к полям и методам внутреннего класса InnerClass, если они имеют соответствующий спецификатор доступа.
В данном случае innerField является приватным полем, но доступ к нему осуществляется через метод display() внутреннего класса.
Если бы поле innerField было private, его нельзя было бы напрямую использовать во внешнем классе, но доступ к нему можно было бы получить через методы внутреннего класса.
*/
