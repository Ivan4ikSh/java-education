import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Укажите путь к файлу, который вы хотите прочитать
        File file = new File("example.txt");

        try (Scanner scanner = new Scanner(file)) {
            System.out.println("Содержимое файла:");

            // Чтение файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}