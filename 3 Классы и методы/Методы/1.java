/**
 * Пример перегрузки методов
 */
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

/**
 * Пример переопределения метода:
 */
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));
        System.out.println(calc.add(5, 3, 7));
        System.out.println(calc.add(5.5, 3.2));

        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.sound();
        myDog.sound();
    }
}
