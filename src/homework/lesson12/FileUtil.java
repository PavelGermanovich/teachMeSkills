package homework.lesson12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {
    private static final Path CAR_INFO = Path.of("src/homework/lesson12/vehiclesInfo.txt");

    public static void writeToFile(String info) {
        try {
            Files.writeString(CAR_INFO, info);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String readCarInfo() {
        StringBuffer resultInfo = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(CAR_INFO.toString()))) {
            while (bufferedReader.ready()) {
                resultInfo.append(bufferedReader.readLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return resultInfo.toString();
    }
}
