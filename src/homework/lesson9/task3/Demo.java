package homework.lesson9.task3;

import java.io.IOException;

/**
 * 3)В исходном файле находятся слова, каждое слово на новой строку.
 * После запуска программы должен создать файл, который будет содержать в себе только палиндромы
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        FileUtil fileUtil = new FileUtil();
        String resultedFilePath = "src/homework/lesson9/task3/result.txt";
        String palindromStr = fileUtil.readPalindromesFromFile();
        fileUtil.writeFileUtil(palindromStr, resultedFilePath);
    }
}
