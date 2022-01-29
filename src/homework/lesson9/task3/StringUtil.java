package homework.lesson9.task3;

public class StringUtil {
    public boolean isStringPolindrom(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
