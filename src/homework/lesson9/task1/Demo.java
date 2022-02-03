package homework.lesson9.task1;

import java.util.Scanner;

public class Demo {

    /**
     * 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringUtil stringUtil = new StringUtil();
        System.out.println("Input String for which substring operation will be made");
        String stringActual = stringUtil.getInputStringForSubstring();
        System.out.println("Input first char for substring");
        char charFirstIndex = stringUtil.getCharValidated(stringActual);
        System.out.println("Input last char for substring");
        char charLastIndex = stringUtil.getSecondCharValidated(stringActual, charFirstIndex);
        stringUtil.showSubstring(stringActual, charFirstIndex, charLastIndex);
    }
}