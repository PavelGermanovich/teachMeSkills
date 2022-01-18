package sessions.lesson3;

import java.util.Scanner;

public class TaskFirst {

    /**
     * check if input int number is odd or even
     */
    public static void main(String[] args) {
        while (true) {
            int a;
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            System.out.println("Number is even -> " + ((a % 2 == 0) ? "yes" : "no"));

            if (a % 7 == 0) {
                System.out.println("exit");
                break;
            }
        }
    }
}
