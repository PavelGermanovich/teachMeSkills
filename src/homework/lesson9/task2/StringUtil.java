package homework.lesson9.task2;

import java.util.Scanner;

public class StringUtil {
    private Scanner scanner = new Scanner(System.in);

    public String getInputStringValidated() {
        System.out.println("Input string with length > 2");
        String actual = scanner.next();
        if (actual.length() < 3) {
            System.out.println("Incorrect string lenth input, please repeat");
            actual = getInputStringValidated();
        }
        return actual;
    }

    public String replaceAll(String strForReplace) {
        return strForReplace.replaceAll(String.valueOf(strForReplace.charAt(2)),
                String.valueOf(strForReplace.charAt(0)));
    }
}
