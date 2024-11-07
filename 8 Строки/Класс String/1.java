public class Main {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "   Hello, World!   ";
        String str3 = "Java Programming";
        String str4 = "Hello, World!";
        String str5 = "Hello, Java!";

        // 1. length(): Возвращает длину строки
        System.out.println("Length of str1: " + str1.length()); // Вывод: 13

        // 2. charAt(): Возвращает символ, находящийся по указанному индексу
        System.out.println("Character at index 7 in str1: " + str1.charAt(7)); // Вывод: W

        // 3. substring(): Возвращает подстроку, начиная с указанного индекса
        System.out.println("Substring of str3 from index 5: " + str3.substring(5)); // Вывод: Programming

        // 4. toUpperCase(): Преобразует строку в верхний регистр
        System.out.println("Uppercase str3: " + str3.toUpperCase()); // Вывод: JAVA PROGRAMMING

        // 5. toLowerCase(): Преобразует строку в нижний регистр
        System.out.println("Lowercase str3: " + str3.toLowerCase()); // Вывод: java programming

        // 6. trim(): Удаляет начальные и конечные пробелы
        System.out.println("Trimmed str2: " + str2.trim()); // Вывод: Hello, World!

        // 7. equals(): Сравнивает строки на равенство
        System.out.println("str1 equals str4: " + str1.equals(str4)); // Вывод: true

        // 8. equalsIgnoreCase(): Сравнивает строки без учета регистра
        System.out.println("str1 equalsIgnoreCase 'hello, world!': " + str1.equalsIgnoreCase("hello, world!")); // Вывод: true

        // 9. contains(): Проверяет, содержит ли строка указанную последовательность символов
        System.out.println("str3 contains 'Program': " + str3.contains("Program")); // Вывод: true

        // 10. replace(): Заменяет все вхождения одного символа или подстроки на другой
        System.out.println("Replacing 'Java' with 'Python' in str5: " + str5.replace("Java", "Python")); // Вывод: Hello, Python!
    }
}
