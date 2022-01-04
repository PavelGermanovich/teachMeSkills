package lesson3;

import java.util.Scanner;

public class MonthsTask {

    /**
     * Task matching months and days names for input numbers
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input months number -> ");
        int monthsNumber = scanner.nextInt();
        while (monthsNumber > 12 || monthsNumber < 0) {
            System.out.println("Incorrect number of MONTHS");
            System.out.println("Input correct months number -> ");
            monthsNumber = scanner.nextInt();
        }

        System.out.println("Input days number -> ");
        int daysNumber = scanner.nextInt();
        while (daysNumber < 0 || daysNumber > 31) {
            System.out.println("Incorrect number of DAYS");
            System.out.println("Input correct days number -> ");
            daysNumber = scanner.nextInt();
        }

        System.out.println("Months name is " + getMonthName(monthsNumber));
        System.out.println("Days name is " + getDaysName(daysNumber));
    }

    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1: {
                return "Jan";
            }
            case 2: {
                return "Feb";
            }
            case 3: {
                return "March";
            }
            case 4: {
                return "April";
            }
            case 5: {
                return "May";
            }
            case 6: {
                return "June";
            }
            case 7: {
                return "Jul";
            }
            case 8: {
                return "Aug";
            }
            case 9: {
                return "Sept";
            }
            case 10: {
                return "Oct";
            }
            case 11: {
                return "Nov";
            }
            case 12: {
                return "Dec";
            }
            default: {
                return "Incorrect month name";
            }
        }
    }

    public static String getDaysName(int daysNumber) {
        switch (daysNumber) {
            case 1:
                return "Mon";
            case 2:
                return "Tue";
            case 3:
                return "Wend";
            case 4:
                return "Thurs";
            case 5:
                return "Frid";
            case 6:
                return "Sat";
            case 7:
                return "Sunday";
            default:
                return "Incorrect days name";
        }
    }
}
