package sessions.lesson11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {
    public static void writeFileUtil(String stringToWrite, String filePath) {
        try {
            Files.writeString(Path.of(filePath), stringToWrite);
            System.out.println("Writing process is finished");
        } catch (IOException e) {
            System.out.println("File writing aborted\n" + e.getMessage());
        }
    }

    public static void createFile(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("File already existed!");
        }
    }

    public static String readFileContent(File file) {
        StringBuffer result = new StringBuffer();
        try (FileInputStream fileReader = new FileInputStream(file)) {
            int i;
            while ((i = fileReader.read()) != -1) {
                result.append(((char) i));
            }
        } catch (IOException e) {
            System.out.println("File reading is aborted\n" + e.getMessage());
        }
        System.out.println("Reading process is finished");
        return result.toString();
    }
}