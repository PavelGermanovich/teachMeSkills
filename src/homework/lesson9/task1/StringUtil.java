package homework.lesson9.task1;

import java.util.Scanner;

public class StringUtil {
    private Scanner scanner = new Scanner(System.in);

    public char getInputChar() throws Exception {
        String charToSubstring = scanner.next();
        if (charToSubstring.length() == 1) {
            return charToSubstring.charAt(0);
        } else {
            throw new Exception("Input not valid, 1 character should be input!");
        }
    }

    public char getCharLengthValidated() {
        char result = ' ';
        try {
            result = getInputChar();
        } catch (Exception e) {
            System.out.println("Try again, 1 character should be input!");
            result = getCharLengthValidated();
        }
        return result;
    }

    public char getCharValidated(String stringForSubstring) {
        char charToSubstring = getCharLengthValidated();
        if (stringForSubstring.indexOf(charToSubstring) == -1) {
            System.out.println("Input char which not exist in input String! Please correct!");
            charToSubstring = getCharValidated(stringForSubstring);
        }
        return charToSubstring;
    }

    public char getSecondCharValidated(String stringForSubstring, char firstCharIndex) {
        char lastIndexForSubstring = getCharValidated(stringForSubstring);
        if (stringForSubstring.indexOf(firstCharIndex) > stringForSubstring.lastIndexOf(lastIndexForSubstring)) {
            System.out.println("Input char is located BEFORE first char for substring! Please correct");
            lastIndexForSubstring = getCharValidated(stringForSubstring);
        }
        return lastIndexForSubstring;
    }

    public void showSubstring(String stringActual, char charFirstIndex, char charLastIndex) {
        String result = stringActual.substring(stringActual.indexOf(charFirstIndex),
                stringActual.lastIndexOf(charLastIndex));
        if (result.isEmpty()) {
            System.out.println("Result string is empty, because firstChar equals last char");
        } else {
            System.out.println(result);
        }
    }
}
