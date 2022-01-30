package homework.lesson9.task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {
    public StringBuilder readLinesFromFile(String pathToFile) throws FileNotFoundException {
        StringBuilder resultStr = new StringBuilder();
        Scanner scanner = new Scanner(new File(pathToFile));
        scanner.useDelimiter("\\.");
        while (scanner.hasNext()) {
            resultStr.append(scanner.next() + ".");
        }
        scanner.close();
        return resultStr;
    }

    public void writeToFileString(String pathToFile, String strToWrite) throws IOException {
        FileWriter fileWriter = new FileWriter(pathToFile);
        fileWriter.write(strToWrite);
        fileWriter.close();
    }
}
