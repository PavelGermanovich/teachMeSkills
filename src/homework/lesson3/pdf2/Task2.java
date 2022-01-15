package homework.lesson3.pdf2;

public class Task2 {
    /**
     *  2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
     *  сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
     */
    public static void main(String[] args) {
        int amebCount = 1;
        int hours = 3;
        do {
            amebCount *= 2;
            System.out.println(String.format("Ameb count after %d hours is %d", hours, amebCount));
            hours += 3;
        } while (hours != 27);
    }
}
