package sessions.lesson10.task1;

import java.util.Scanner;

public class StringUtil {
    private String str;

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void checkStringEndWith(String endWith) {
        if (this.str.endsWith(endWith)) {
            System.out.println("Строка заканчивается на " + endWith);
        } else {
            System.out.println("Строка не заканчивается на " + endWith);
        }
    }

    public void checkStringStartWith(String startWith) {
        if (this.str.startsWith(startWith)) {
            System.out.println("Строка начинается на " + startWith);
        } else {
            System.out.println("Строка не начинается на " + startWith);
        }
    }

    public void checkStrContains(String contains) {
        if (this.str.contains(contains)) {
            System.out.println("Строка содержит " + contains);
        } else {
            System.out.println("Строка не содержит " + contains);
        }
    }

    public void showPosition(String strToFind) {
        if (this.str.contains(strToFind)) {
            System.out.println("Позиция слова " + strToFind + str.indexOf(strToFind));
        } else {
            System.out.println("Искомого слова нет в строке");
        }
    }

    public void changeAllSybmols(String strToReplace, String replacementStr) {
        System.out.println(str.replaceAll(strToReplace, replacementStr));
    }

    public void setToUpperCase() {
        System.out.println(str.toUpperCase());
    }

    public void setToLowerCase() {
        System.out.println(str.toLowerCase());
    }

    public void substring(String strToSubstring) {
        if (str.contains(strToSubstring)) {
            String result = str.substring(0, str.indexOf(strToSubstring)) +
                    str.substring(str.indexOf(strToSubstring) + strToSubstring.length(), str.length() - 1);
            System.out.println(result);
        } else {
            System.out.println();
        }
    }
}
