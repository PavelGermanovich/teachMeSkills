package homework.lesson9.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {
    public String readPalindromesFromFile() throws FileNotFoundException {
        String file = "src/homework/lesson9/task3/polindroms.txt";
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter("\n");

        StringBuilder resultStrBuilder = new StringBuilder();
        while (scanner.hasNext()) {
            String next = scanner.next();
            if (new StringUtil().isStringPolindrom(next)) {
                resultStrBuilder.append(next + "\n");
            }
        }
        scanner.close();
        return resultStrBuilder.toString();
    }

    public void writeFileUtil(String stringToWrite, String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(stringToWrite);
        fileWriter.close();
    }
}
