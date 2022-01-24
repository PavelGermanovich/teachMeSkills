package homework.lesson7.task3;

public class Demo {
    public static void main(String[] args) {
        SpacePort spacePort = new SpacePort();
        spacePort.launch(new Shuttle());
        spacePort.launch(new SpaceX());
        spacePort.launch(new RoskocmosShuttle());
    }
}