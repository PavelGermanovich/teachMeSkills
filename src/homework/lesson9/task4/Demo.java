package homework.lesson9.task4;

import java.io.IOException;

/**
 * Текстовый файл содержит текст. После запуска программы в другой файл
 * должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
 * предложении присутствует слово-палиндром, то не имеет значения какое кол-во
 * слов в предложении, оно попадает в новый файл.
 * Пишем все в ООП стиле. Создаём класс TextFormater
 * в котором два статических метода:
 * 1. Метод принимает строку и возвращает кол-во слов в строке.
 * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
 * есть возвращает true, если нет false
 * В main считываем файл.
 * Разбиваем текст на предложения. Используя методы класса TextFormater
 * определяем подходит ли нам предложение. Если подходит добавляем его в
 * новый файл
 */
public class Demo {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        TextFormatter textFormatter = new TextFormatter();
        String pathToActualFile = "src/homework/lesson9/task4/polindromsLines.txt";
        String pathToResultFile = "src/homework/lesson9/task4/result.txt";
        StringBuilder resultToWrite = new StringBuilder();
        try {
            String[] sentences = fileUtil.readLinesFromFile(pathToActualFile).toString().split("\\.");
            for (String sentence : sentences) {
                if (textFormatter.isLineContainsPolindrom(sentence)) {
                    resultToWrite.append(sentence + ".");
                } else if (textFormatter.getNumberOfWordsFromLine(sentence) > 2 && textFormatter
                        .getNumberOfWordsFromLine(sentence) < 6) {
                    resultToWrite.append(sentence + ".");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        try {
            fileUtil.writeToFileString(pathToResultFile, resultToWrite.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }
}
