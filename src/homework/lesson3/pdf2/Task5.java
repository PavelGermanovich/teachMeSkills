package homework.lesson3.pdf2;

public class Task5 {
    /**
     * 5)Напишите программу печати таблицы перевода расстояний из дюймов в
     * сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
     */
    public static void main(String[] args) {
        int inches = 1;
        while (inches < 21) {
            System.out.println(String.format("%d inches equals %f cm", inches, inches * 2.54));
            inches++;
        }
    }
}
