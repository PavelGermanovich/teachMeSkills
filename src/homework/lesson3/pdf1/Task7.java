package homework.lesson3.pdf1;

import java.util.Scanner;

public class Task7 {
    /**
     * В переменную записываете количество программистов. В зависимости от количества программистов необходимо вывести
     * правильно окончание. Например:
     * • 2 программиста
     * • 1 программиста
     * • 10 программистов • и т.д.
     */
    public static void main(String[] args) {
        int devNumber;
        do {
            System.out.println("Введите кол-во программистов");
            devNumber = new Scanner(System.in).nextInt();
            String russianDevName = getRussianNameAccordingToTheNumber(devNumber);
            System.out.println(devNumber + " " + russianDevName);
        } while (devNumber >= 0);
    }

    public static String getRussianNameAccordingToTheNumber(int num) {
        String numString = String.valueOf(num);
        if (!numString.endsWith("11")) {
            if (num % 10 == 1) {
                return "программист";
            }
        } else {
            return "программистов";
        }

        if (num % 10 == 0) {
            return "программистов";
        }

        if (numString.contains("5") || numString.contains("6") || numString.contains("7")
                || numString.contains("8") || numString.contains("9")) {
            return "программистов";
        } else if (numString.length() > 1 && numString.charAt(numString.length() - 2) == '1') {
            return "программистов";
        } else {
            return "программиста";
        }
    }
}


    //программистов - 0, 5-20, 25-30
    //программиста - 2-4, 22-24
    //программист - 1, 21. 101, 121 +++
