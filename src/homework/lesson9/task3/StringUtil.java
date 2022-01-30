package homework.lesson9.task3;

public class StringUtil {
    public boolean isStringPolindrom(String str) {
        return str.length() > 1 && str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
