package homework.lesson12;

public class Demo {
    /**
     * В ваших проектах, сделать формирование отчета. В отдельном потоке,
     * получаете все ваши объекты и формируете текстовый файл, в который выводите
     * все ваши объекты
     */
    public static void main(String[] args) {
        Thread vehiclesReportThread = new Thread(new TransportReportUtil());
        vehiclesReportThread.start();
        try {
            vehiclesReportThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(FileUtil.readCarInfo());
    }
}