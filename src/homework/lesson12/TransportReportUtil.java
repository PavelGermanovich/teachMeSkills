package homework.lesson12;

import java.sql.SQLOutput;

public class TransportReportUtil implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread with creating report with vehicles has started!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        TransportCreator transportCreator = new TransportCreator();
        String resultInfo = String.join("\n", transportCreator.getCar().toString(),
                transportCreator.getTrack().toString(), transportCreator.getCivilAirTransport().toString(), transportCreator.getMilitaryAirTransport().toString());
        FileUtil.writeToFile(resultInfo);
        System.out.println("Thread with creating report has finished!");
    }
}
