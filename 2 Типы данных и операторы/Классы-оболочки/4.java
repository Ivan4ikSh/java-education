/**
 * Практика #4: Результаты выполнения кода и объяснение
 *
 * @author Ivan
 */
public class Main {
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1==i1 " + (a1 == i1));  // true
        System.out.println("b1==i1 " + (b1 == i1));  // true
        System.out.println("a1==b1 " + (a1 == b1));  // false
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));  // true
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));  // true
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));  // true

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2));  // true
        System.out.println("b2==i2 " + (b2 == i2));  // true
        System.out.println("a2==b2 " + (a2 == b2));  // true
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));  // true
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));  // true
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));  // true
    }
}
/**
 * Объяснение:
 * При работе с автоупаковкой для чисел от -128 до 127 используется класс IntegerCache, который кэширует эти значения.
 * Поэтому для переменных a2 и b2, которые хранят число 127, ссылки будут указывать на один и тот же объект.
 * Для значений за пределами диапазона кэша (например, 128) объекты Integer создаются заново, и ссылки на них будут разными, даже если значения одинаковы.
 *
 * Результаты:
 * a1 == i1 и b1 == i1 дадут true, так как при сравнении объекта и примитива происходит распаковка, и сравниваются значения.
 * a1 == b1 даст false, потому что для значений за пределами диапазона кэша IntegerCache создаются разные объекты.
 * a1.equals(i1) и b1.equals(i1) дадут true, так как метод equals() сравнивает сами значения.
 * Для a2 == b2 результат будет true, так как значения в диапазоне -128 до 127 кэшируются, и a2 и b2 ссылаются на один и тот же объект.
 *
 * Класс IntegerCache
 * IntegerCache — это внутренний класс, который хранит объекты Integer в диапазоне от -128 до 127 для повторного использования,
 * чтобы уменьшить количество созданных объектов и повысить производительность.
 */
