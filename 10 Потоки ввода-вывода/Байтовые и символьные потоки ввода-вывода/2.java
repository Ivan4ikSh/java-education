import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "output.txt"; // Путь к файлу, в который будет записан текст

        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            String text = "Hello, World!";
            // Запись каждого символа в файл
            for (char c : text.toCharArray()) {
                outputStream.write(c); // Запись символа в виде байта
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}