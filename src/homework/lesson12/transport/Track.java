package homework.lesson12.transport;

public class Track extends GroundTransport {
    private int loadCapacity;

    public Track(int power, int maxSpeed, int weight, String mark, int numberOfWheels,
                 int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, mark, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Это грузовая машина со следующими хар-ми: " + super.toString() +
                ", Грузоподъемность = " + loadCapacity;
    }

    public void checkLoadCapacity(int weight) {
        System.out.println(loadCapacity >= weight ? "Грузовик загружен" : "Вам нужен грузовик побольше");
    }
}
