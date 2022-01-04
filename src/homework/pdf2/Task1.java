package homework.pdf2;

public class Task1 {
    /**
     *   1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
     *  день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
     *  суммарный путь пробежит спортсмен за 7 дней?
     */
    public static void main(String[] args) {
        int daysNumber = 7;
        int kmPerDay = 10;
        double distance = kmPerDay;

        for (int i = 1; i < daysNumber; i++) {
            kmPerDay *= 1.1;
            distance += kmPerDay;
        }
        System.out.println("Суммарный путь равен " + distance);
    }
}
