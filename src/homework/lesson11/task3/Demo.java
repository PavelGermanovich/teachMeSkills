package homework.lesson11.task3;

import java.io.File;
import java.util.List;

public class Demo {
    /**
     * 3) Проверка на цензуру:
     * Создаете 2 файла.
     * 1 - й. Содержит исходный текст.
     * 2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
     * определите сами, хотите каждое слово на новой строке, хотите через запятую
     * разделяйте, ваша программа делайте как считаете нужным.
     * Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
     * встретилось ни одного недопустимого слова, то выводите сообщение о том что
     * текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
     * сообщение, кол-во предложений не прошедших проверку и сами предложения
     * подлежащие исправлению.
     */
    public static void main(String[] args) {
        File sourceText = new File("src/homework/lesson11/task3/SourceText.txt");
        File blackList = new File("src/homework/lesson11/task3/blackListWords.txt");
        String sourceString = FileUtil.readFileContent(sourceText);
        String blackListStr= FileUtil.readFileContent(blackList);
        String[] blackListWords = blackListStr.split(",");
        List blackListedSentence = StringUtil.getBlackListedSentences(sourceString, blackListWords);
        if (blackListedSentence.size() == 0) {
            System.out.println("Текст прошел проверку на цензуру");
        } else {
            System.out.printf("Текст не прошел проверку на цензуру. Найдено %d предложений. Следующие предложения не прошли цензуру\n",
                    blackListedSentence.size());
            System.out.println(String.join("\n", blackListedSentence));
        }
    }
}
