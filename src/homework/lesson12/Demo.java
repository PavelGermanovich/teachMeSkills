package homework.lesson12;

public class Demo {
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