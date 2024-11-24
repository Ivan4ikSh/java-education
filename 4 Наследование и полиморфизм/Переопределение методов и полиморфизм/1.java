class Calculator {
    // Перегруженный метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей запятой
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Сумма двух целых: " + calc.add(5, 10)); // Вызов метода с двумя параметрами
        System.out.println("Сумма трех целых: " + calc.add(5, 10, 15)); // Вызов метода с тремя параметрами
        System.out.println("Сумма двух дробных: " + calc.add(5.5, 10.5)); // Вызов метода с плавающей запятой
    }
}