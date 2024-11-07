public class Main {
    public static void main(String[] args) {
        // Создание объектов StringBuffer и StringBuilder
        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder("World");

        // 1. append(): Добавляет строку в конец
        stringBuffer.append(", Java!");
        stringBuilder.append(" Programming!");
        System.out.println("StringBuffer after append: " + stringBuffer); // Вывод: Hello, Java!
        System.out.println("StringBuilder after append: " + stringBuilder); // Вывод: World Programming!

        // 2. insert(): Вставляет строку в указанную позицию
        stringBuffer.insert(7, "Amazing ");
        stringBuilder.insert(6, "Cool ");
        System.out.println("StringBuffer after insert: " + stringBuffer); // Вывод: Hello, Amazing Java!
        System.out.println("StringBuilder after insert: " + stringBuilder); // Вывод: World Cool Programming!

        // 3. delete(): Удаляет часть строки по индексу
        stringBuffer.delete(7, 15);
        stringBuilder.delete(6, 11);
        System.out.println("StringBuffer after delete: " + stringBuffer); // Вывод: Hello, Java!
        System.out.println("StringBuilder after delete: " + stringBuilder); // Вывод: World Programming!

        // 4. reverse(): Переворачивает строку
        stringBuffer.reverse();
        stringBuilder.reverse();
        System.out.println("StringBuffer after reverse: " + stringBuffer); // Вывод: !avaJ ,olleH
        System.out.println("StringBuilder after reverse: " + stringBuilder); // Вывод: !gnimmargorP dlroW

        // 5. setCharAt(): Заменяет символ по указанному индексу
        stringBuffer.setCharAt(0, 'H');
        stringBuilder.setCharAt(0, 'P');
        System.out.println("StringBuffer after setCharAt: " + stringBuffer); // Вывод: HavaJ ,olleH
        System.out.println("StringBuilder after setCharAt: " + stringBuilder); // Вывод: PgnimmargorP dlroW

        // 6. substring(): Извлекает подстроку
        String subStrBuffer = stringBuffer.substring(0, 5);
        String subStrBuilder = stringBuilder.substring(0, 10);
        System.out.println("Substring from StringBuffer: " + subStrBuffer); // Вывод: HavaJ
        System.out.println("Substring from StringBuilder: " + subStrBuilder); // Вывод: Pgnimmarg

        // 7. length(): Возвращает длину строки
        System.out.println("Length of StringBuffer: " + stringBuffer.length()); // Вывод: 12
        System.out.println("Length of StringBuilder: " + stringBuilder.length()); // Вывод: 21

        // 8. capacity(): Возвращает текущую емкость (вместимость) буфера
        System.out.println("Capacity of StringBuffer: " + stringBuffer.capacity()); // Емкость может быть разной
        System.out.println("Capacity of StringBuilder: " + stringBuilder.capacity()); // Емкость может быть разной

        // 9. ensureCapacity(): Увеличивает емкость при необходимости
        stringBuffer.ensureCapacity(50);
        stringBuilder.ensureCapacity(50);
        System.out.println("Capacity of StringBuffer after ensureCapacity: " + stringBuffer.capacity()); // Вывод: 50
        System.out.println("Capacity of StringBuilder after ensureCapacity: " + stringBuilder.capacity()); // Вывод: 50

        // 10. replace(): Заменяет часть строки на другую строку
        stringBuffer.replace(0, 5, "Hi");
        stringBuilder.replace(0, 10, "Programming");
        System.out.println("StringBuffer after replace: " + stringBuffer); // Вывод: Hi ,olleH
        System.out.println("StringBuilder after replace: " + stringBuilder); // Вывод: Programming dlroW
    }
}
