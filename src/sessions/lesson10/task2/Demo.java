package sessions.lesson10.task2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Input first number");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.println("Input second number");
        int second = scanner.nextInt();

        StringUtil stringUtil = new StringUtil();
        StringBuilder strAddition = stringUtil.formStringAddition(first, second);
        System.out.println(strAddition);

        StringBuilder strSubtraction = stringUtil.formStringSubtraction(first, second);
        System.out.println(strAddition);

        StringBuilder strMultiply = stringUtil.formStringMultiply(first, second);
        System.out.println(strMultiply);

        System.out.println(stringUtil.replaceEqualsUsingInsert(strMultiply));
        System.out.println();

        System.out.println(stringUtil.replaceEqualsUsingInsert(strSubtraction));
    }
}
