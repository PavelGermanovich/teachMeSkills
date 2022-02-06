package homework.lesson11.task3;

import java.io.*;

public class FileUtil {
    public static String readFileContent(File file) {
        StringBuffer strBuff = new StringBuffer();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
            strBuff.append(reader.readLine());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return strBuff.toString();
    }
}
