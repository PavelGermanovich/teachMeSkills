package homework.lesson11.task3;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
    public static List getBlackListedSentences(String text, String[] blackListWords) {
        String[] sentences = text.split("\\.");
        List<String> blackListedSent = new ArrayList<>();
        for (String sentence: sentences) {
            if (isSentenceContainsBlackListWords(sentence, blackListWords)) {
                blackListedSent.add(sentence);
            }
        }
        return blackListedSent;
    }

    public static boolean isSentenceContainsBlackListWords(String sentence, String[] words) {
        for (String blackListWord: words) {
            if (sentence.contains(blackListWord.trim())) {
                return true;
            }
        }
        return false;
    }
}
