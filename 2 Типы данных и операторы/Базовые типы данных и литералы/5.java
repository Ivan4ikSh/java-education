public class Main {
    public static void main(String[] args) {
        byte b = 10;
        int i = 20;
        double d = 30.5;

        double result = b + i + d;
        System.out.println("Result: " + result);
        //Объяснение: все операнды приводятся к типу с наибольшей точностью (в данном случае double)
    }
}