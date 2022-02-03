package homework.lesson9.task4;

import java.util.Arrays;

public class TextFormatter {
    private final String SPECIAL_CHAR_REGEX = "[\\s@&.?$+-]+";

    public boolean isLineContainsPolindrom(String line) {
        return Arrays.stream(line.split(SPECIAL_CHAR_REGEX))
                .anyMatch(string -> string.length() > 1 &&
                        string.trim().equalsIgnoreCase(new StringBuilder(string.trim()).reverse().toString()));
    }

    public int getNumberOfWordsFromLine(String line) {
        return line.trim().split(SPECIAL_CHAR_REGEX).length;
    }
}