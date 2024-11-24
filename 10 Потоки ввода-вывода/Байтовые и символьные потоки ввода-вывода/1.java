import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Путь к файлу, который будет прочитан

        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            int data;
            // Чтение байтов из файла до конца
            while ((data = inputStream.read()) != -1) {
                // Преобразование байта в символ и вывод на экран
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}